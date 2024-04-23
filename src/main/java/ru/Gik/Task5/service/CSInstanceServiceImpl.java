package ru.Gik.Task5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.dto.CSInstanceAnsDTO;
import ru.Gik.Task5.dto.CSInstanceReqDTO;
import ru.Gik.Task5.entity.*;
import ru.Gik.Task5.exception.DuplicatesException;
import ru.Gik.Task5.exception.ResourceNotFoundException;
import ru.Gik.Task5.exception.ValidationFieldsException;
import ru.Gik.Task5.repo.*;

import java.util.List;

@RequiredArgsConstructor
@Service
@Validated
public class CSInstanceServiceImpl implements CSInstanceService{
    @Autowired
    private final MyRepoAccount myRepoAccount;
    private final MyRepoTppProductRegister myRepoTppProductRegister;
    private final MyRepoTppRefProductRegisterType myRepoTppRefProductRegisterType;
    private final MyRepoAccountPool myRepoAccountPool;
    private final MyRepoTppProduct  myRepoTppProduct;
    private final MyRepoAgreement myRepoAgreement;
    private final MyRepoTppRefProductClass myRepoTppRefProductClass;

    public CSInstanceAnsDTO addInstance(CSInstanceReqDTO ddto) {
        //var acc = new Account(ddto.accountNumber(),ddto.bussy());
        System.out.println("I'm in CSInstanceAnsDTO addInstance");
        //Long ret_accId=1L;

        //STEP 1
        if(ddto.productType().isEmpty()
        || ddto.productCode() == null
                || ddto.registerType().isEmpty()
        || ddto.mdmCode().isEmpty()
                || ddto.contractNumber().isEmpty()
                || ddto.contractDate() == null
                || ddto.priority() == null
                || ddto.contractId()==null
                || ddto.branchCode().isEmpty()
                || ddto.isoCurrencyCode().isEmpty()
                || ddto.urgencyCode().isEmpty()
                || ddto.number().isEmpty()
                || ddto.openingDate()==null
        ){
            throw new ValidationFieldsException("Fields not validated");
        }
        //STEP 2
        if(ddto.instanceId()==null) {
            //STEP 1.1
            //Проверка - есть ли запись в таблице продуктов
            TppProduct probe = new TppProduct();
            probe.setNumber(ddto.contractNumber());
            Example<TppProduct> example=Example.of(probe);
            if(myRepoTppProduct.exists(example)) {
                throw new DuplicatesException("№ договора <значение> уже существует для ЭП с ИД " + ddto.contractNumber());
            }
            //STEP 1.2
            //Проверка - есть ли запись в таблице договоров
            Agreement probe12 = new Agreement();
            probe12.setNumber(ddto.number());
            Example<Agreement> example12=Example.of(probe12);
            if(myRepoAgreement.exists(example12)) {
                throw new DuplicatesException("Параметр № Дополнительного соглашения (сделки) Number уже существует для ЭП с ИД " + ddto.contractNumber());
            }

            //STEP 1.3
            //Ищем в классификаторе продуктов
            TppRefProductClass probe13 = new TppRefProductClass();
            probe13.setValue(Long.toString(ddto.productCode()));
            Example<TppRefProductClass> example13=Example.of(probe13);
            if(!myRepoTppRefProductClass.exists(example13)) {
                throw new ResourceNotFoundException("No information found in ProductClass");
            }
            //Ищем в реестре продуктов
            TppRefProductRegisterType probe131 = new TppRefProductRegisterType();
            probe131.setProductClassCode(Long.toString(ddto.productCode()));
            probe131.setAccountType("Клиентский");
            Example<TppRefProductRegisterType> example131=Example.of(probe131);
            if(!myRepoTppRefProductRegisterType.exists(example131)) {
                throw new ResourceNotFoundException("No information found in ProductRegisterType");
            }

            //Запоминаем массив ProductRegisterType
            List<TppRefProductRegisterType> lprt = myRepoTppRefProductRegisterType.findAll(example131);

            //STEP 1.4
            //Добавляем продукт
            myRepoTppProduct.save(new TppProduct(ddto.productCode(),
                    0L,
                    ddto.productType(),
                    ddto.number(),
                    ddto.priority(),
                    ddto.contractDate(),
                    ddto.openingDate(),
                    ddto.closingDate(),
                    0L,
                    0.0,
                    0.0,
                    ddto.thresholdAmount(),
                    "",
                    "",
                    0.0,
                    "",
                    ddto.status()
                    ));
            //STEP 1.5 - непонятно, откуда брать данные (в исходном запросе нет номера счета, кода валюты и т.п.)
        }
        if(ddto.instanceId()!=null) {
            //STEP 2.1
            //Проверка - есть ли запись в таблице продуктов
            System.out.println("I'm in 2.1");
            TppProduct probe21 = new TppProduct();
            probe21.setId(ddto.instanceId());
            Example<TppProduct> example21=Example.of(probe21);
            if(!myRepoTppProduct.exists(example21)) {
                throw new ResourceNotFoundException("Экземпляр продукта с параметром instanceId не найден: " + ddto.instanceId());
            }

        }
        /*
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
        TppProductRegister probe6 = new TppProductRegister();
        probe.setProductId(ddto.instanceId());
        probe.setType(ddto.registryTypeCode());
        Example<TppProductRegister> example6=Example.of(probe6);
        if(myRepoTppProductRegister.exists(example6)) {
            List <TppProductRegister> tpr = myRepoTppProductRegister.findAll(example6);
            TppProductRegister tp=tpr.get(0);
            ret_accId=tp.getId();
        }

        CSAccountAnsDTO ret = new CSAccountAnsDTO(ret_accId);
        return ret;


        //return myRepoAccount.save(acc);*/
        CSInstanceAnsDTO ret = new CSInstanceAnsDTO("1","1","1");
        return ret;


    }

}
