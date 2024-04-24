package ru.gik.conveyer;

import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import ru.Gik.Task5.RestApplication;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.entity.Account;
import ru.Gik.Task5.entity.Artefact;
import ru.Gik.Task5.service.AccountService;
import ru.Gik.Task5.service.ArtefactService;

import java.math.BigInteger;
import java.util.Optional;

import static io.restassured.RestAssured.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {RestApplication.class})
@AutoConfigureWebTestClient
@Testcontainers
public class ConveyerApplicationTests {
    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres")
            .withDatabaseName("postgres")
            .withUsername("postgres")
            .withPassword("postgres")
			/*.withCopyFileToContainer(MountableFile.forHostPath("schema.sql"),
                "/docker-entrypoint-initdb.d/"
			)*/;


    @BeforeAll
    static void beforeAll(ApplicationContext context) {
        postgres.start();

    }
    @BeforeEach
    void setUp(ApplicationContext context) {

    }


    @AfterAll
    static void afterAll() {
        postgres.stop();
    }

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.name", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Test
    void contextLoads(ApplicationContext context) {
        Assertions.assertNotNull(context);
    }

    @Test
    void pgContainerIsUp() {
        Assertions.assertEquals("running", postgres.getContainerInfo().getState().getStatus());
    }

    @Test
    void shouldCreateArtefact(ApplicationContext context, @Autowired ArtefactService serv) {
        Artefact res = serv.saveArtefact(new Artefact("testArt1"));
        //System.out.println(res.getId());
        Integer id = res.getId();

        Optional<Artefact> res2 = serv.getArtefactbyId(BigInteger.valueOf(id));
        if (res2.isPresent()) {
            Assertions.assertEquals("testArt1", res2.get().getName());
        } else {
            Assertions.fail("No res from db");
        }
    }

    /*@Test
    void shouldCreateAccount(ApplicationContext context, @Autowired AccountService serv) {
        Account res = serv.addAccount(new AccountDTO(7L,1L,"12345",false));
        //System.out.println(res.getId());
        Long id = res.getId();

        Optional<Account> res2 = serv.getById(id);
        if (res2.isPresent()) {
            Assertions.assertEquals("12345", res2.get().getAccountNumber());
        } else {
            Assertions.fail("No res from db");
        }
    }*/

    @LocalServerPort
    private int port;

    @Test
    void shouldCreateArtefactFromREST() //RestAssured
    {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
        when().request("GET", "/artefact/5").then().statusCode(404);
    }

}
