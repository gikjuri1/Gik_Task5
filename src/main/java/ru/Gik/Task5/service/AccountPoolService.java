package ru.Gik.Task5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Gik.Task5.entity.AccountPool;
import ru.Gik.Task5.repo.MyRepoAccountPool;

import java.util.List;
import java.util.Optional;

@Service
public class AccountPoolService {
    @Autowired
    MyRepoAccountPool repo;
    AccountPool newAccountPool(String branchCode, String currencyCode, String mdmCode, String priorityCode, String registryTypeCode)
    {
        AccountPool a = new AccountPool(branchCode, currencyCode, mdmCode, priorityCode, registryTypeCode);
        repo.save(a);
        return a;
    }

    public AccountPool saveAccountPool(AccountPool a)
    {
        repo.save(a);
        return  a;
    }

    public Optional<AccountPool> getAccountPoolbyId(Long id)
    {
        return repo.findById(id);
    }

    List<AccountPool> getAllAccountPool()
    {
        return (List<AccountPool>) repo.findAll();
    }

}
