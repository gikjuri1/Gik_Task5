package ru.Gik.Task5.restControllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.service.AccountService;

@RestController
@RequestMapping("/accounts/")
public class AccountRestController {
    @Autowired
    private final AccountService accountService;

    @Autowired
    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@Valid @RequestBody AccountDTO ddto){

        var accreg = accountService.addAccount(ddto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AccountDTO> getAccountById (@PathVariable(name = "id") Long id)
    {
        var acc = accountService.getById(id);
        AccountDTO ddto = new AccountDTO(id,
                null,acc.get().getAccountNumber(),acc.get().isBussy());

        return new ResponseEntity<AccountDTO>(ddto, HttpStatus.OK);
    }

}
