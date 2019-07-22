package com.bangbank.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.tags.form.CheckboxTag;
import org.springframework.web.servlet.tags.form.CheckboxesTag;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.AddressDao;
import com.bangbank.dao.BARDao;
import com.bangbank.dao.GenericDao;
import com.bangbank.dto.BankAccountDTO;
import com.bangbank.entity.Address;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;
 
@Service
public class AccountOpenService {
	
	@Autowired
	private BARDao bardao;
	
	@Autowired
	private AddressDao addrDao;
	
	BankAccountRequest acc=new BankAccountRequest();
	
	Address  addr = new Address();
	
	@Transactional
	public String accountopen(BankAccountDTO accountdto) {
		
		String path = "d:/uploads/Aadhar/";
		String filename = accountdto.getFirstName()+" "+accountdto.getLastName()+"-"+accountdto.getAadharCard().getOriginalFilename();
		String finalPath = path + filename;
		
		try {
			accountdto.getAadharCard().transferTo(new File(finalPath));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		acc.setTitle(accountdto.getTitle());
		acc.setFirstName(accountdto.getFirstName());
		acc.setMiddleName(accountdto.getMiddleName());
		acc.setLastName(accountdto.getLastName());
		acc.setFatherName(accountdto.getFatherName());
		acc.setMobileNo(accountdto.getMobileNo());
		acc.setEmailId(accountdto.getEmailId());
		acc.setAadharCardNo(accountdto.getAadharCardNo());
		//acc.setDOB(accountdto.getDOB());
		acc.setApproved("FALSE");	
		acc.setOccupation(accountdto.getOccType());
		acc.setAadharCardFilePath(filename);
		
		
		addr.setAddress1(accountdto.getResAddrLine1());
		addr.setAddress2(accountdto.getResAddrLine2());
		addr.setLandMark(accountdto.getResLandMark());
		addr.setState(accountdto.getResState());
		addr.setCity(accountdto.getResCity());
		addr.setPincode(accountdto.getResPinCode());
		
		Address  address = addrDao.addToDataBase(addr);
		
		int addrId = address.getAddrId();
		
		System.out.println("AOS->"+accountdto.getCheckBox());
		if(accountdto.getCheckBox().equals("on")) {
		
			acc.setResidentialAddress(addrId);
			acc.setPermenantAddress(addrId);
		}
		else {
			
			addr.setAddress1(accountdto.getPerAddrLine1());
			addr.setAddress2(accountdto.getPerAddrLine2());
			addr.setLandMark(accountdto.getPerLandMark());
			addr.setState(accountdto.getPerState());
			addr.setCity(accountdto.getPerCity());
			addr.setPincode(accountdto.getPerPinCode());
			
			Address  perAddr = addrDao.addToDataBase(addr);
			
			int perId = perAddr.getAddrId();
			
			acc.setResidentialAddress(addrId);
			acc.setPermenantAddress(perId);
			
		}

		bardao.addToDataBase(acc);
		
		return "success";
	}
}
