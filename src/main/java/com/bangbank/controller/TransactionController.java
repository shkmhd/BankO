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

@RestController
@RequestMapping("/Transfer")
public class TransactionController {
	@Autowired
	BankTransactionService bts;
	@RequestMapping("/NEFT")
	public ModelAndView neftTransaction(Map<String,Object> model) {
		/* bts.transfer(ts); */
		return new ModelAndView("forward:/TransactionSuccess.html", model);
	}
	@RequestMapping("/RTGS")
	public ModelAndView rtgsTransaction(Map<String,Object> model) {
		return new ModelAndView("forward:/TransactionSuccess.html", model);
	}
	@RequestMapping("/IMPS")
	public ModelAndView impsTransaction(Map<String,Object> model) {
		return new ModelAndView("forward:/TransactionSuccess.html", model);
	}
}
