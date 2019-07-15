package com.bangbank.controller;

import java.io.InputStream;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bangbank.service.BankTransactionService;
import com.lti.entity.Transaction;

@RestController
@RequestMapping("/Transfer")
public class TransferController {
	
	@Autowired
	BankTransactionService bts;
	
	@RequestMapping("/NEFT")
	public ModelAndView neftTransaction(Map<String,Object> model,Transaction transaction) {
		
		if(bts.transfer(transaction,"NEFT")) {
			
			model.put("Reference ID", transaction.getTrnId());
			model.put("Mode", transaction.getMode());
			model.put("To Account", transaction.getToAccNo());
			model.put("Amount", transaction.getAmt());
			model.put("From Account", transaction.getFrmAccNo());	
			model.put("Date", transaction.getTrnDate());
			model.put("Remarks", transaction.getRemarks());
			
			return new ModelAndView("forward:/TransactionSuccess.html", model);
		}
		else
			return new ModelAndView("forward:/TransactionFailed.html", model);
	}
	
	@RequestMapping("/RTGS")
	public ModelAndView rtgsTransaction(Map<String,Object> model,Transaction transaction) {
		
		if(bts.transfer(transaction,"RTGS")) {
			
			model.put("Reference ID", transaction.getTrnId());
			model.put("Mode", transaction.getMode());
			model.put("To Account", transaction.getToAccNo());
			model.put("Amount", transaction.getAmt());
			model.put("From Account", transaction.getFrmAccNo());	
			model.put("Date", transaction.getTrnDate());
			model.put("Remarks", transaction.getRemarks());
		
			return new ModelAndView("forward:/TransactionSuccess.html", model);
		}
		else
			return new ModelAndView("forward:/TransactionFailed.html", model);
	}
	
	@RequestMapping("/IMPS")
	public ModelAndView impsTransaction(Map<String,Object> model,Transaction transaction) {
		
		if(bts.transfer(transaction,"IMPS")) {
		
			model.put("Reference ID", transaction.getTrnId());
			model.put("Mode", transaction.getMode());
			model.put("To Account", transaction.getToAccNo());
			model.put("Amount", transaction.getAmt());
			model.put("From Account", transaction.getFrmAccNo());	
			model.put("Date", transaction.getTrnDate());
			model.put("Remarks", transaction.getRemarks());
			
			return new ModelAndView("forward:/TransactionSuccess.html", model);
		}
		else
			return new ModelAndView("forward:/TransactionFailed.html", model);
	}
}
