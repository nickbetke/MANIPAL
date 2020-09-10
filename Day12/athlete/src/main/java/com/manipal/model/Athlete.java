package com.manipal.model;

public class Athlete {
	String name;
	String gender;
	String category;
	String mail;
	long mobile;
	public Athlete() {
		
	}
	public Athlete(String name, String gender, String category, String mail, long mobile) {
		super();
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.mail = mail;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getCategory() {
		return category;
	}
	public String getMail() {
		return mail;
	}
	public long getMobile() {
		return mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
