package ru.Gik.Task5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.entity.Account;
import ru.Gik.Task5.entity.TppProductRegister;
import ru.Gik.Task5.repo.MyRepoAccount;
import ru.Gik.Task5.exception.*;
import ru.Gik.Task5.repo.MyRepoTppProductRegister;

@RequiredArgsConstructor
@Service
@Validated
public class CSAccountServiceImpl implements CSAccountService{
    @Autowired
    private final MyRepoAccount myRepoAccount;
    private final MyRepoTppProductRegister myRepoTppProductRegister;

    public CSAccountAnsDTO addAccount(CSAccountReqDTO ddto) {
        //var acc = new Account(ddto.accountNumber(),ddto.bussy());
        System.out.println("I'm in CSAccountAnsDTO addAccount");


        //STEP 1
        if(ddto.instanceId() == null) {
            throw new ValidationFieldsException("Fields not validated");
        }
        //STEP 2
        //Проверка - есть ли запись в таблице продуктов
        TppProductRegister probe = new TppProductRegister();
        probe.setProductId(ddto.instanceId());
        probe.setType(ddto.registryTypeCode());
        Example<TppProductRegister> example=Example.of(probe);
        if(!myRepoTppProductRegister.exists(example)) {
            throw new DuplicatesException("Exist duplicates");
        }

        CSAccountAnsDTO ret = new CSAccountAnsDTO("1");
        return ret;


        //return myRepoAccount.save(acc);
    }

}
