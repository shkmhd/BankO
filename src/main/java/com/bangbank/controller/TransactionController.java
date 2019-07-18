package com.bangbank.controller;

import java.io.InputStream;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bangbank.service.BankTransactionService;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.Transaction;

@RestController
@RequestMapping("/Transfer")
public class TransactionController {
	
	@Autowired
	BankTransactionService bts;
	
	@RequestMapping(path = "/NEFT",method = RequestMethod.POST)
	public TransactionDTO neftTransaction(Map<String,Object> model,@RequestBody TransactionDTO transaction) {
		
		return bts.transfer(transaction,"NEFT");
	}
	
	@RequestMapping(path = "/RTGS",method = RequestMethod.POST)
	public TransactionDTO rtgsTransaction(@RequestBody TransactionDTO transaction) {
	
		return bts.transfer(transaction,"RTGS");
		}
	
	@RequestMapping(path = "/IMPS",method = RequestMethod.POST)
	public TransactionDTO impsTransaction(Map<String,Object> model,@RequestBody TransactionDTO transaction) {
		
		return bts.transfer(transaction,"IMPS");
	}
}
