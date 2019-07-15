package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Beneficiary_TBL")
public class Beneficiary {
	
	@Id
	@GeneratedValue
	private int beneficiaryId;
	
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private int accountNumber;
	private String nickName;

}
