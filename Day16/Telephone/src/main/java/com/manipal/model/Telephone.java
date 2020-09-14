package com.manipal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Telephone {
	@Id
	int tId;
	String telNo;
	String mobile;
	public Telephone() {
		super();
	}
	public Telephone(int tId, String telNo, String mobile) {
		super();
		this.tId = tId;
		this.telNo = telNo;
		this.mobile = mobile;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
