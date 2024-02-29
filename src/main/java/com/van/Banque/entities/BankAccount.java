package com.van.Banque.entities;

import com.van.Banque.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Data  @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class BankAccount {

    @Id
    private String id;
    private Date createdAt;

    private Double balance;
    private String currency;

    @Enumerated(EnumType.STRING)
    private AccountType type;

}
