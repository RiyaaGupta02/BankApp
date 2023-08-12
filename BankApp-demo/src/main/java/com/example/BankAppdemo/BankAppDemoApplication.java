package com.example.BankAppdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BankAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppDemoApplication.class, args);
	}

}
