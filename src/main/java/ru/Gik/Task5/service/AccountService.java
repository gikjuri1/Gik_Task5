package ru.Gik.Task5.service;

import jakarta.validation.Valid;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.entity.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> getById(Long id);
    Account addAccount(@Valid AccountDTO ddto);
    Optional<Account> getAccountbyId(Long id);
}
