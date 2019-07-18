package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.OnlineAccountDao;

import com.bangbank.entity.OnlineAccount;

@Service
public class LoginService {
	
		@Autowired
		private OnlineAccountDao oadao;
	
		public boolean passwordValidation(OnlineAccount oa) {
		
		System.out.println("Service is called");
		if(oadao.fetchOA(oa.getAccount().getAccnumber()).getLoginPassword()==oa.getLoginPassword()) {
			return true;
		}
		else
		return false;
	}
}
