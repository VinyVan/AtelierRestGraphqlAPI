package com.van.Banque.services;

import com.van.Banque.dto.BankAccountRequestDTO;
import com.van.Banque.dto.BankAccountResponseDTO;
import com.van.Banque.entities.BankAccount;

import java.util.Date;
import java.util.UUID;

public class AccountServiceImpl implements AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO){
        BankAccount bankAccount=BankAccount.builder().
                id(UUID.randomUUID().toString()).
                createdAt(new Date()).
                type(bankAccountRequestDTO.getType()).
                currency(bankAccountRequestDTO.getCurrency()).
                balance(bankAccountRequestDTO.getBalance()).
                build();

        return null;
    }
}
