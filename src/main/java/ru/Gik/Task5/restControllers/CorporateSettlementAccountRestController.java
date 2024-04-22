package ru.Gik.Task5.restControllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.exception.ResourceNotFoundException;
import ru.Gik.Task5.service.AccountService;
import ru.Gik.Task5.service.CSAccountService;

@RestController
@RequestMapping("/corporate-settlement-account")
public class CorporateSettlementAccountRestController {

    @Autowired
    private final CSAccountService CSaccountService;

    @Autowired
    public CorporateSettlementAccountRestController(CSAccountService CSaccountService) {
        this.CSaccountService = CSaccountService;
    }

    @PostMapping(value = "/create", headers = "content-type=application/json")
    public ResponseEntity<CSAccountAnsDTO> createAccount(@Valid @RequestBody CSAccountReqDTO ddto){

        var accreg = CSaccountService.addAccount(ddto);

        //return new ResponseEntity<>(HttpStatus.CREATED);
        //throw new ResourceNotFoundException("Not found Resource");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(accreg);
    }

}
