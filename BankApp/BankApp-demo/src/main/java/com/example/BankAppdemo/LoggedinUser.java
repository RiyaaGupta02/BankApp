package com.example.BankAppdemo;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.example.BankAppdemo.model.Customer;

public class LoggedinUser {

	 public static Long getAccountNumber() {
	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        if (authentication != null) {
	            Object principal = ((org.springframework.security.core.Authentication) authentication).getPrincipal();
	            
	            if (principal instanceof Customer) {
	            	 Customer customer = (Customer) principal;
	                 return customer.getCustomerName();
	            }
	        }
	        throw new Exception("Account number not found in Security Context.");
	    }
}
