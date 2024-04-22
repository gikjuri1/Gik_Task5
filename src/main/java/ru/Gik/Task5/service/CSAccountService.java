package ru.Gik.Task5.service;

import jakarta.validation.Valid;
//import ru.Gik.Task5.dto.AccountDTO;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
//import ru.Gik.Task5.entity.Account;

public interface CSAccountService {
    CSAccountAnsDTO addAccount(@Valid CSAccountReqDTO ddto);
}
