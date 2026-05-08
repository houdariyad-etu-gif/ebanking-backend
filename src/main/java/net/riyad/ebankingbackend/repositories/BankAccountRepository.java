package net.riyad.ebankingbackend.repositories;

import net.riyad.ebankingbackend.entities.BankAccount;
import net.riyad.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
