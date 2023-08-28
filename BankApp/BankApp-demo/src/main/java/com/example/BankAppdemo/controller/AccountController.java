package com.example.BankAppdemo.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankAppdemo.DTO.AmountRequest;
import com.example.BankAppdemo.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	@PostMapping("/deposit")
	public ResponseEntity<?> cashDeposit(@RequestBody AmountRequest amountRequest){
		 AccountService.cashDeposit(LoggedinUser.getAccountNumber(), amountRequest.getAmount());
	        
	        Map<String, String> response =  new HashMap<>();
	        response.put("msg", "Cash deposited successfully");
	        
	        return new ResponseEntity<>( response, HttpStatus.OK);
	        
	}
}
