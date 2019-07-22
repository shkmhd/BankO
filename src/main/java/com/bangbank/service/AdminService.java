package com.bangbank.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.BARDao;
import com.bangbank.dto.AccountDTO;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;
import com.bangbank.entity.Transaction;

@Service
public class AdminService {

	@Autowired
	private BARDao barDao;
	
	//private BankAccount bankAcc;
 		
	public List<AccountDTO> getAccountRequests() {
		
		List<BankAccountRequest> barlist = barDao.getReqList("FALSE");
		
		List<AccountDTO> bardtolist=new ArrayList<AccountDTO>();
		
		for(BankAccountRequest bareq:barlist) {
Path srcFile = Paths.get("d:/uploads/Aadhar/"+bareq.getAadharCardFilePath());
			Path destFile = Paths.get("src/main/resources/static/uploads/"+bareq.getAadharCardFilePath());
				
			try {
				
				Files.copy(srcFile, destFile, StandardCopyOption.REPLACE_EXISTING);
					
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			System.out.println(bareq.getBARid());
			AccountDTO bardto=new AccountDTO(bareq);
			System.out.println(bardto.getBARid());
			bardtolist.add(bardto);
		}
		System.out.println("After loop in Service"+bardtolist.get(0).getBARid());
		return bardtolist;
	}
}
