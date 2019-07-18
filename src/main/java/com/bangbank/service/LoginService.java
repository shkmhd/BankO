package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.AdminAccountDao;
import com.bangbank.dao.OnlineAccountDao;
import com.bangbank.dto.OnlineAccountDto;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.entity.AdminAccount;
import com.bangbank.entity.OnlineAccount;

@Service
public class LoginService {
	
		@Autowired
		private OnlineAccountDao oadao;
		@Autowired
		private AdminAccountDao aadao;
		public VerificationStatusDto passwordValidation(OnlineAccountDto oad) {
		
			OnlineAccount oa=oadao.fetchOA(oad.getAccno());
			if(oa==null) {
				return new VerificationStatusDto("false");
			}
			else {
			if(oad.getLoginPassword().equals(oa.getLoginPassword()))
				return new VerificationStatusDto("true",oad.getAccno());
			else
				return new VerificationStatusDto("false");
		}
		}

		public VerificationStatusDto AdminPasswordValidation(AdminAccount a) {
			
			System.out.println("Service is called");
			AdminAccount aa=aadao.fetchByUsername(a.getUsername());
			if(aa==null) {
				return new VerificationStatusDto("false");
			}
			else {
			if(a.getPassword().equals(aa.getPassword()))
				return new VerificationStatusDto("true");
			else
				return new VerificationStatusDto("false");
		}
		}
}
