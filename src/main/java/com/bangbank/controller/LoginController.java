package com.bangbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.OnlineAccountDto;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.entity.AdminAccount;
import com.bangbank.entity.OnlineAccount;
import com.bangbank.service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(path = "/User", method=RequestMethod.POST)
	public VerificationStatusDto fetch(@RequestBody OnlineAccountDto oadto) {
		
		System.out.println("Controller is called");
		
		/* String passWord = loginService.showSearch(accNo); */
		return loginService.passwordValidation(oadto);
			
	}
	@RequestMapping(path = "/Admin", method=RequestMethod.POST)
	public VerificationStatusDto fetchAdmin(@RequestBody AdminAccount aa) {
		
		System.out.println("Controller is called");
		
		/* String passWord = loginService.showSearch(accNo); */
		return loginService.AdminPasswordValidation(aa);
			
	}
}
	

