package com.example.banking.controller;

import com.example.banking.model.Customer;
import com.example.banking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    // for the deposit process working take place update done
    @PostMapping("/accounts/{id}/deposit")
    public ResponseEntity<Account> deposit(@PathVariable Long id, @RequestBody DepositRequest request) {
    Account updatedAccount = accountService.deposit(id, request.getAmount());
    return ResponseEntity.ok(updatedAccount);
    }


    @GetMapping
    public List<Customer> getAll() {
        return service.getAllCustomers();
    }
}
