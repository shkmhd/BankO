package com.bangbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dao.AccountDao;
import com.bangbank.dto.AccountDTO;
import com.bangbank.entity.BankAccountRequest;
import com.bangbank.service.AdminService;

@RestController
//@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired
	private AdminService adService;

	@RequestMapping(path = "/admin")
	public  List<AccountDTO> transfer() {
		List<AccountDTO>listacc=adService.getAccountRequests();
		System.out.println(listacc.get(0).getBARid());
		return listacc;
	}
}
