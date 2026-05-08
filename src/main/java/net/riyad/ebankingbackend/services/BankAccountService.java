package net.riyad.ebankingbackend.services;

import net.riyad.ebankingbackend.dtos.CustomerDTO;
import net.riyad.ebankingbackend.entities.BankAccount;
import net.riyad.ebankingbackend.entities.CurrentAccount;
import net.riyad.ebankingbackend.entities.Customer;
import net.riyad.ebankingbackend.entities.SavingAccount;
import net.riyad.ebankingbackend.exceptions.BalanceNotSufficientException;
import net.riyad.ebankingbackend.exceptions.BankAccountNotFoundException;
import net.riyad.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft , Long customerId ) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate , Long customerId ) throws CustomerNotFoundException;

    List<CustomerDTO> listCustomers();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccount> bankAccountList();
}
