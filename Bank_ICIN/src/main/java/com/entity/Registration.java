package com.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="registration")
public class Registration {
	@Id @GeneratedValue
	private int uId;
	private String uName;
	private String uEmail;
	private String uContact;
	private String uPan;
	private String uPass;
	private String uDOB;
	@Override
	public String toString() {
		return "Registration [uId=" + uId + ", uName=" + uName + ", uEmail=" + uEmail + ", uContact=" + uContact
				+ ", uPan=" + uPan + ", uPass=" + uPass + ", uDOB=" + uDOB + "]";
	}

	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}


		
	public Registration( String uName, String uEmail, String uContact, String uPan, String uPass, String uDOB) {

		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uContact = uContact;
		this.uPan = uPan;
		this.uPass = uPass;
		this.uDOB = uDOB;
		
	
	
}
}
