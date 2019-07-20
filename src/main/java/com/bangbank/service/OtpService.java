package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.bangbank.dao.AccountDao;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.dto.VerificationStatusDto;
import java.util.Random; 
@Service
public class OtpService {
	@Autowired
	BankTransactionService bts;
	@Autowired
	private MailSender mailSender;
	@Autowired
	private AccountDao adao;
	public VerificationStatusDto otpValidation(TransactionDTO td,String svOtp) {
		if(Integer.parseInt(svOtp)==td.getOtp()) {
			System.out.println("Checking in Service if");
		TransactionDTO tdo=bts.transfer(td,"Gateway");
		VerificationStatusDto vdt=new VerificationStatusDto("success");
		vdt.setTxno(tdo.getTransactionID());
		return vdt;
		}
		else {
			System.out.println("Checking in Service else");
			return new VerificationStatusDto("failed");
	}}
	static char[] OTP(int len) 
    { 
       
        // Using numeric values 
        String numbers = "0123456789"; 
  
        // Using random method 
        Random rndm_method = new Random(); 
  
        char[] otp = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i] = 
             numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        return otp; 
    } 
	public String otpGen(TransactionDTO td) {
		//Send email and gen otp
		String email = adao.fetchById(td.getFrmAccNo()).getEmailId();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("Rubina.Z@lntinfotech.com");
		message.setTo(email);
		message.setSubject("OTP for Payment Gateway");
		String otp=new String(OTP(4));
		message.setText("Hello, The OTP for your payment of Rs"+td.getAmt()+" to "+td.getToAccNo()+" on "+td.getTrnDate()+" is "+otp);
		mailSender.send(message);
		return otp;

	}
}
