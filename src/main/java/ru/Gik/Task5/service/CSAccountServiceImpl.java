package ru.Gik.Task5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.entity.Account;
import ru.Gik.Task5.repo.MyRepoAccount;
import ru.Gik.Task5.exception.*;

@RequiredArgsConstructor
@Service
@Validated
public class CSAccountServiceImpl implements CSAccountService{
    @Autowired
    private final MyRepoAccount myRepoAccount;

    public CSAccountAnsDTO addAccount(CSAccountReqDTO ddto) {
        //var acc = new Account(ddto.accountNumber(),ddto.bussy());
        System.out.println("I'm in CSAccountAnsDTO addAccount");


        //STEP 1
        if(ddto.instanceId() == null) {
            throw new ValidationFieldsException("Fields not validated");
        }
        CSAccountAnsDTO ret = new CSAccountAnsDTO("1");
        return ret;

        //return myRepoAccount.save(acc);
    }

}
