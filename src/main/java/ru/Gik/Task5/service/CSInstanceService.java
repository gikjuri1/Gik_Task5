package ru.Gik.Task5.service;

import jakarta.validation.Valid;
import ru.Gik.Task5.dto.CSAccountAnsDTO;
import ru.Gik.Task5.dto.CSAccountReqDTO;
import ru.Gik.Task5.dto.CSInstanceAnsDTO;
import ru.Gik.Task5.dto.CSInstanceReqDTO;
//import ru.Gik.Task5.entity.Account;

public interface CSInstanceService {
    CSInstanceAnsDTO addInstance(@Valid CSInstanceReqDTO ddto);
}
