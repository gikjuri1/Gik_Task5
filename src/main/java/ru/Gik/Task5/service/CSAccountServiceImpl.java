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
import ru.Gik.Task5.entity.AccountPool;
import ru.Gik.Task5.entity.TppProductRegister;
import ru.Gik.Task5.entity.TppRefProductRegisterType;
import ru.Gik.Task5.repo.MyRepoAccount;
import ru.Gik.Task5.exception.*;
import ru.Gik.Task5.repo.MyRepoAccountPool;
import ru.Gik.Task5.repo.MyRepoTppProductRegister;
import ru.Gik.Task5.repo.MyRepoTppRefProductRegisterType;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Validated
public class CSAccountServiceImpl implements CSAccountService{
    @Autowired
    private final MyRepoAccount myRepoAccount;
    private final MyRepoTppProductRegister myRepoTppProductRegister;
    private final MyRepoTppRefProductRegisterType myRepoTppRefProductRegisterType;
    private final MyRepoAccountPool myRepoAccountPool;

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
        //STEP 4
        //Ищем в AccountPool
        AccountPool probe4 = new AccountPool();
        probe4.setBranchCode(ddto.branchCode());
        probe4.setCurrencyCode(ddto.currencyCode());
        probe4.setMdmCode(ddto.mdmCode());
        probe4.setPriorityCode(ddto.priorityCode());
        probe4.setRegistryTypeCode(ddto.registryTypeCode());
        Example<AccountPool> example4=Example.of(probe4);
        if(!myRepoAccountPool.exists(example4)) {
            throw new ResourceNotFoundException("No information found in account pool");
        }
        //Запоминаем id счета
        List<AccountPool> accountPool = myRepoAccountPool.findAll(example4);
        AccountPool fap=accountPool.get(0);
        Long accId=fap.getId();

        //берем номер счета в таблице счетов
        Account probe5 = new Account();
        probe5.setId(accId);
        Example<Account> example5=Example.of(probe5);
        if(!myRepoAccount.exists(example5)) {
            throw new ResourceNotFoundException("No resource found");
        }
        List <Account> acc = myRepoAccount.findAll(example5);
        Account fa=acc.get(0);
        String accNum=fa.getAccountNumber();

        //Optional<Account> a = MyRepoAccount.findById(accId);
        //List<Account> ls = myRepoAccount.findById(accId);
        //String foundAccNum=ls.get(0).getAccountNumber();

        //Сохраняем продуктовый регистр
        myRepoTppProductRegister.save(
                new TppProductRegister(ddto.instanceId(),ddto.registryTypeCode(),accId,ddto.currencyCode(),"2",accNum));

        //Возвращаем ответ
        CSAccountAnsDTO ret = new CSAccountAnsDTO("1");
        return ret;


        //return myRepoAccount.save(acc);
    }

}
