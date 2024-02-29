package com.van.Banque.services;

import com.van.Banque.dto.BankAccountRequestDTO;
import com.van.Banque.dto.BankAccountResponseDTO;

public interface AccountService {

    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
