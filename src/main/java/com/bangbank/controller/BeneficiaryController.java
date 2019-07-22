package com.bangbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bangbank.dto.BeneficiaryDTO;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.service.BeneficiaryService;

@RestController
public class BeneficiaryController {
	@Autowired
	private BeneficiaryService bs;
@RequestMapping(path = "/BeneficiaryAdd",method = RequestMethod.POST)
public VerificationStatusDto addBeneficiary(@RequestBody BeneficiaryDTO bd) {
	System.out.println("sxsjbnxkjsb"+bd.getBenaccnumber());
	return bs.addBeneficiary(bd);
}
@RequestMapping(path = "/GetBene",method = RequestMethod.POST)
public List<BeneficiaryDTO> getBeneficiary(@RequestBody VerificationStatusDto bd) {
	System.out.println("sxsjbnxkjsb"+bd.getLoggedInAccNo());
	return bs.getBeneficiary(bd.getLoggedInAccNo());
}
}
