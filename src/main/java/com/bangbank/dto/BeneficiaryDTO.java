package com.bangbank.dto;




import org.hibernate.annotations.GeneratorType;

import com.bangbank.entity.BankAccount;


public class BeneficiaryDTO {
	
	
	private int beneficiaryId;
	
	private String title;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private long benaccnumber; //accno of the beneficiary
	
	private long accnumber; //Accno whose beneficiary obj is

	public long getBenaccnumber() {
		return benaccnumber;
	}
	public void setBenaccnumber(long benaccnumber) {
		this.benaccnumber = benaccnumber;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
	private String nickName;
	public int getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public BeneficiaryDTO(int beneficiaryId, String title, String firstName, String middleName, String lastName,
			long benaccnumber, long accnumber, String nickName) {
		this.beneficiaryId = beneficiaryId;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.benaccnumber = benaccnumber;
		this.accnumber = accnumber;
		this.nickName = nickName;
	}
	public BeneficiaryDTO() {
	}
	@Override
	public String toString() {
		return "BeneficiaryDTO [beneficiaryId=" + beneficiaryId + ", title=" + title + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", benaccnumber=" + benaccnumber
				+ ", accnumber=" + accnumber + ", nickName=" + nickName + "]";
	}
	
	
}
