package com.van.Banque.web;

import com.van.Banque.entities.BankAccount;
import com.van.Banque.repositories.BanqueAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/")
public class AccountRestController {

    private BanqueAccountRepository banqueAccountRepository;

    public AccountRestController(BanqueAccountRepository banqueAccountRepository){
        this.banqueAccountRepository=banqueAccountRepository;
    }
    @GetMapping("/bankAccounts")
    public List<BankAccount> getBankAccounts(){
        return banqueAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount getBankAccount(@PathVariable String id){
        return banqueAccountRepository.findById(id).orElseThrow(
                ()->new RuntimeException(String.format("L'utilisateur avec l'id %d est inexistant",id))
        );
    }

@PostMapping("/bankAccounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        bankAccount.setId(UUID.randomUUID().toString());
        bankAccount.setCreatedAt(new Date());
        return banqueAccountRepository.save(bankAccount);
    }

}
