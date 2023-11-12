package org.sid.bankaccountservice.service;

import org.sid.bankaccountservice.dto.BankAccountReponseDTO;
import org.sid.bankaccountservice.dto.BankAccountRequestDTO;

public interface AccountService {
    BankAccountReponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountReponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
