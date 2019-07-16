package com.bangbank;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.bangbank.dao.TransactionDao;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Transaction;
import com.bangbank.service.BankTransactionService;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
/* @SpringBootTest */
public class BangBankApplicationTests {

	@Autowired
	private BankTransactionService bts;

	@Test
	public void contextLoads() {
		
		
		  TransactionDTO ts= new TransactionDTO();
		  ts.setFrmAccNo(111222L); 
		  ts.setToAccNo(281L);
		  ts.setAmt(2000D);
		  ts.setRemarks("Abc");
		  ts.setTrnDate(new Date());
		 System.out.println( bts.transfer(ts, "IMPS"));
		 

		/*
		 * List<Account>accl=dao.fetchAllDetails(Account.class); for(Account acc:accl) {
		 * System.out.println(acc.getEmailId()); }
		 */
		/*
		 * Account acc= new
		 * Account(112233L,"Mr","No","No","No","NO",123123L,"shaks",11223344L, new
		 * Date(),123,321,"js",120000D); dao.addToDataBase(acc);
		 */
	}

}
