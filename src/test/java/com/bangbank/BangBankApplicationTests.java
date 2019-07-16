package com.bangbank;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.bangbank.entity.Account;
import com.bangbank.entity.Transaction;
import com.bangbank.service.BankTransactionService;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
/* @SpringBootTest */
public class BangBankApplicationTests {

	@Test
	public void contextLoads() {
		BankTransactionService bts = new BankTransactionService();
		Account acc=new Account();
		acc.setAccId(111222);
		bts.transfer(new Transaction(123,acc,11112222,1200, new Date(), "IMPS", "remarks"),"IMPS");
	}

}
