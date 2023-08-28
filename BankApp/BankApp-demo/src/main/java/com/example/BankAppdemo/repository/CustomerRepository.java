package com.example.BankAppdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankAppdemo.model.Customer;

 
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	Customer findByAccountNumber(String accountNumber);
	
}