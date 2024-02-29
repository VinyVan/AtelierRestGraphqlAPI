package com.van.Banque;

import com.van.Banque.entities.BankAccount;
import com.van.Banque.enums.AccountType;
import com.van.Banque.repositories.BanqueAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BanqueAccountRepository banqueAccountRepository){
		return (test)->{
			for(int i=0;i<10;i++){
				banqueAccountRepository.save(
				new BankAccount(
						UUID.randomUUID().toString(),
						new Date(),
						Math.random()*1000,
						"MAD",
						(Math.random()>0.5 ? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
				));
			}
		};
	}
}
