package com.example.banking.service;

import com.example.banking.model.Customer;
import com.example.banking.model.Transaction;
import com.example.banking.repository.CustomerRepository;
import com.example.banking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private TransactionRepository transactionRepository;

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer deposit(Long customerId, double amount) {
        Customer customer = repository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        customer.setBalance(customer.getBalance() + amount);
        repository.save(customer);

        Transaction txn = new Transaction();
        txn.setType("DEPOSIT");
        txn.setAmount(amount);
        txn.setCustomer(customer);
        txn.setTimestamp(LocalDateTime.now());

        transactionRepository.save(txn);

        return customer;
    }
}
