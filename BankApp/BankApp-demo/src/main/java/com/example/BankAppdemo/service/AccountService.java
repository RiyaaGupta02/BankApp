package com.example.BankAppdemo.service;

import com.example.BankAppdemo.model.Account;
import com.example.BankAppdemo.model.Customer;

public interface AccountService {
	
	public Account createAccount(Customer user);
	
}
