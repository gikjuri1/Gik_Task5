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
import ru.Gik.Task5.entity.TppRefProductRegisterType;
import ru.Gik.Task5.repo.MyRepoAccount;
import ru.Gik.Task5.exception.*;
import ru.Gik.Task5.repo.MyRepoTppProductRegister;
import ru.Gik.Task5.repo.MyRepoTppRefProductRegisterType;

@RequiredArgsConstructor
@Service
@Validated
public class CSAccountServiceImpl implements CSAccountService{
    @Autowired
    private final MyRepoAccount myRepoAccount;
    private final MyRepoTppProductRegister myRepoTppProductRegister;
    private final MyRepoTppRefProductRegisterType myRepoTppRefProductRegisterType;

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
        if(myRepoTppProductRegister.exists(example)) {
            throw new DuplicatesException("Exist duplicates");
        }

        //STEP 3
        TppRefProductRegisterType probe3 = new TppRefProductRegisterType();
        probe3.setValue(ddto.registryTypeCode());
        Example<TppRefProductRegisterType> example3=Example.of(probe3);
        if(!myRepoTppRefProductRegisterType.exists(example3)) {
            throw new ResourceNotFoundException("No resource found");
        }

        CSAccountAnsDTO ret = new CSAccountAnsDTO("1");
        return ret;


        //return myRepoAccount.save(acc);
    }

}
