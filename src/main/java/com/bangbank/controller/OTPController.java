package com.bangbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.TransactionDTO;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.service.OtpService;
@RestController
public class OTPController {
	@Autowired
	private OtpService otpService;
	
@RequestMapping(path = "/OTPCheck",method = RequestMethod.POST)
public VerificationStatusDto otpCheck(@RequestBody TransactionDTO od, HttpSession session) {
	System.out.println("Controller is called");
	return otpService.otpValidation(od,(String)session.getAttribute("otp"));
}
@RequestMapping(path = "/OTPGen",method = RequestMethod.POST)
public VerificationStatusDto otpGen(HttpSession session,@RequestBody TransactionDTO od) {
	session.setAttribute("otp", otpService.otpGen(od));
	return new VerificationStatusDto("true");
}
}
