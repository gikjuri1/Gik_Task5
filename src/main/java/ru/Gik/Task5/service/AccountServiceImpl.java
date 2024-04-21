package ru.Gik.Task5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.entity.Account;
import ru.Gik.Task5.repo.MyRepoAccount;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Validated
public class AccountServiceImpl implements AccountService{
    @Autowired
    private final MyRepoAccount myRepoAccount;

    @Override
    public Optional<Account> getById(Long id) {
        return Optional.of(myRepoAccount.getById(id));
    }

    @Override
    public Account addAccount(AccountDTO ddto) {
        var acc = new Account(ddto.accountNumber(),ddto.bussy());
        return myRepoAccount.save(acc);
    }

}
