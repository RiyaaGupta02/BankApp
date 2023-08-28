package com.example.BankAppdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/login")
	public String Login() {
		return "this is login page";
	}
	
	
	@GetMapping("/register")
	public String Register() {
		return "this is registration page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "this is admin side";
	}
}

