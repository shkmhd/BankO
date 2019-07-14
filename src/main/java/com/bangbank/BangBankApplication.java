package com.bangbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({ "com.bangbank.controller","com.bangbank.service"})
@SpringBootApplication
public class BangBankApplication {
	public static void main(String[] args) {
		SpringApplication.run(BangBankApplication.class, args);
	}

}
