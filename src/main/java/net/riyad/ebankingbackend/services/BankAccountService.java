package net.riyad.ebankingbackend.services;

import net.riyad.ebankingbackend.dtos.BankAccountDTO;
import net.riyad.ebankingbackend.dtos.CurrentBankAccountDTO;
import net.riyad.ebankingbackend.dtos.CustomerDTO;
import net.riyad.ebankingbackend.dtos.SavingBankAccountDTO;
import net.riyad.ebankingbackend.entities.BankAccount;
import net.riyad.ebankingbackend.exceptions.BalanceNotSufficientException;
import net.riyad.ebankingbackend.exceptions.BankAccountNotFoundException;
import net.riyad.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft , Long customerId ) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate , Long customerId ) throws CustomerNotFoundException;

    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);
}
