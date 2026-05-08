package net.riyad.ebankingbackend.repositories;

import net.riyad.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
