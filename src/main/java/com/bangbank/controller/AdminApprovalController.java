package com.bangbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.AccountDTO;
import com.bangbank.service.AdminApprovalService;

@RestController
public class AdminApprovalController {

	@Autowired
	private AdminApprovalService adminApprService;
	
	@RequestMapping(path="/adminapproval",method = RequestMethod.POST)
	public void transfer(@RequestBody AccountDTO accDto) {
		
		System.out.println("This is the one in controller"+accDto.getBARid());
		
		adminApprService.addToBankAccount(accDto);
	}
	
}
