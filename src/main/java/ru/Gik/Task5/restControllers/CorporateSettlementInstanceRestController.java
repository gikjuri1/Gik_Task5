package ru.Gik.Task5.restControllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.dto.CSInstanceAnsDTO;
import ru.Gik.Task5.dto.CSInstanceReqDTO;
import ru.Gik.Task5.exception.DuplicatesException;
import ru.Gik.Task5.exception.ValidationFieldsException;
import ru.Gik.Task5.service.CSAccountService;
import ru.Gik.Task5.service.CSInstanceService;

@RestController
@RequestMapping("/corporate-settlement-instance")
public class CorporateSettlementInstanceRestController {
    @Autowired
    private final CSInstanceService CSinstanceService;

    @Autowired
    public CorporateSettlementInstanceRestController(CSInstanceService CSinstanceService) {
        this.CSinstanceService = CSinstanceService;
    }

    @PostMapping(value = "/create", headers = "content-type=application/json")
    public ResponseEntity<CSInstanceAnsDTO> createInstance(@Valid @RequestBody CSInstanceReqDTO ddto) {
        var instreg = new CSInstanceAnsDTO("1", "1", "1");
        try {
            instreg = CSinstanceService.addInstance(ddto);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(instreg);
        } catch (ValidationFieldsException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(instreg);
        } catch (DuplicatesException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(instreg);
        }
    }
}
