package com.bangbank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Transaction;
import com.bangbank.service.StatementService;

@RestController
@RequestMapping(path = "/Statement")
public class StatementController {

	@Autowired
	private StatementService stmtService;
	
	@RequestMapping(path = "/Full",method = RequestMethod.POST)
	public List<TransactionDTO> getFullStatement(Map<String,Object> model,@RequestBody AccountDTO adto) {
		
				
			System.out.println("This is the Controller part");	
			
			List<TransactionDTO> transactions= stmtService.fullStatement(adto);
			
			//model.put("Account Number", accDto.getAccId());
			
//			for(Transaction tr:transactions) {
//				
//				model.put("Reference ID "+tr.getTransactionId(), tr.getTransactionId());
//				model.put("Mode "+tr.getTransactionId(), tr.getMode());
//				model.put("To Account"+tr.getTransactionId(), tr.getToAccNo());
//				model.put("Amount"+tr.getTransactionId(), tr.getAmt());
//				model.put("From Account"+tr.getTransactionId(), tr.getFrmAcc());	
//				model.put("Date"+tr.getTransactionId(), tr.getTrnDate());
//				model.put("Remarks"+tr.getTransactionId(), tr.getRemarks());
//			}
//			return new ModelAndView("forward:/FullStatement.html",model);
			
			return transactions;
	}
	
	@RequestMapping(path = "/Mini",method = RequestMethod.POST)
	public List<TransactionDTO> getAccStatement(Map<String,Object> model,@RequestBody AccountDTO accDto) {
		
		System.out.println("This is the controller Part");
	
		List<TransactionDTO> transactions= stmtService.miniStatement(accDto);
		
		//model.put("Account Number", accDto.getAccId());
		
		//return new ModelAndView("forward:/MiniStatement.html",model);
		
		return transactions;
	}
}
