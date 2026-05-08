package net.riyad.ebankingbackend.repositories;

import net.riyad.ebankingbackend.entities.AccountOperation;
import net.riyad.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
