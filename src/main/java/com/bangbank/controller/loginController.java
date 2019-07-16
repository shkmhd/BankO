package com.bangbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.entity.OnlineAccount;
import com.bangbank.service.LoginService;

@RestController
public class loginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(path = "/Login", method=RequestMethod.POST)
	public boolean fetch(@RequestBody OnlineAccount oa) {
		
		System.out.println("Controller is called");
		
		/* String passWord = loginService.showSearch(accNo); */
		return loginService.passwordValidation(oa);
			
	}
}
	

