package net.riyad.ebankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data @NoArgsConstructor @AllArgsConstructor

public class Customer {
    private String id;
    private Long name;
    private String email;

    private List<BankAccount> bankAccount;
}
