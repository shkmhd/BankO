package com.bangbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.BankAccountDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.service.AccountOpenService;


@RestController
public class AccountOpenController {
	
	@Autowired
	private AccountOpenService accountOpenService;
	
	@RequestMapping(path= "/accountopen", method=RequestMethod.POST)
	public void accountopen(@RequestBody BankAccountDTO accountDto) {
		System.out.println(accountDto.getDOB());
		System.out.println(accountDto.getMobileNo());
		accountOpenService.accountopen(accountDto);
	}
}
