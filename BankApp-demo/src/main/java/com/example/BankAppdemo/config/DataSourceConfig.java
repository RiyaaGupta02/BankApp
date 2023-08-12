package com.example.BankAppdemo.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean
	public DataSource getDataSource() {
	    return DataSourceBuilder.create()
		          .driverClassName("com.mysql.cj.jdbc.Driver")
		          .url("jdbc:mysql://localhost:3306/bank_app")
		          .username("root")
		          .password("admin")
		          .build();
	}
}
