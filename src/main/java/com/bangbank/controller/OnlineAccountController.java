package com.bangbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.AccountDTO;
import com.bangbank.dto.OnlineAccountDto;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.service.OnlineAccountService;

@RestController
@RequestMapping("/OnlineAccount")
public class OnlineAccountController {
	
	@Autowired
	private OnlineAccountService onlineAccountService;
	
	@RequestMapping(path="/Register", method=RequestMethod.POST)
	public VerificationStatusDto onlinebankingreg(@RequestBody OnlineAccountDto onlineAccountDTO) {
	
	
	return onlineAccountService.onlinebankingreg(onlineAccountDTO);
	
	}
	
	@RequestMapping(path="/AccCheck", method=RequestMethod.GET)
	public VerificationStatusDto accountCheck(@RequestParam("accno")long accno) {
		
	return onlineAccountService.accountcheck(accno);
	
	}
	@RequestMapping(path = "/accountdetails",method = RequestMethod.POST)
	public AccountDTO accountDetails(@RequestBody AccountDTO ac) {
		
		return onlineAccountService.getAccDetails(ac.getAccId());
	}
	


}
