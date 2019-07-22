package com.bangbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.BeneficiaryDao;
import com.bangbank.dto.BeneficiaryDTO;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Beneficiary;
@Service
public class BeneficiaryService {
@Autowired
private AccountDao adao;
@Autowired
private BeneficiaryDao bdao;
	public VerificationStatusDto addBeneficiary(BeneficiaryDTO bd) {
		BankAccount bacc=adao.fetchById(bd.getAccnumber());
		BankAccount benacc=adao.fetchById(bd.getBenaccnumber());
		if(benacc==null) {
			return new VerificationStatusDto("Beneficiary AccNo is Invalid");
		}
		Beneficiary b=new Beneficiary();
		
		b.setBeneficiaryaccno(bd.getBenaccnumber());
		b.setTitle(benacc.getTitle());
		b.setFirstName(benacc.getFirstName());
		b.setMiddleName(benacc.getMiddleName());
		b.setLastName(benacc.getLastName());
		b.setNickName(bd.getNickName());
		b.setBankAccount(bacc);
		bdao.addToDataBase(b);
		return new VerificationStatusDto("true");
	}
	public List<BeneficiaryDTO> getBeneficiary(long accno){
		List<Beneficiary> lob= bdao.fetchBeneficiariesOfAccountNo(accno);
		List<BeneficiaryDTO> lobdto=new ArrayList<BeneficiaryDTO>();
		for(Beneficiary b:lob) {
			BeneficiaryDTO bd=new BeneficiaryDTO();
			bd.setNickName(b.getNickName());
			bd.setBenaccnumber(b.getBeneficiaryaccno());
			lobdto.add(bd);
		}
		return lobdto;
	}
}
