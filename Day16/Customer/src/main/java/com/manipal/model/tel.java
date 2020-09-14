package com.manipal.model;

public class tel {
	private int tId;
	private String telNo;
	private String mobile;
	
	public tel(int tId, String telNo, String mobile) {
		super();
		this.tId = tId;
		this.telNo = telNo;
		this.mobile = mobile;
	}
	public tel() {
		super();
	}
	@Override
	public String toString() {
		return "tel [tId=" + tId + ", telNo=" + telNo + ", mobile=" + mobile + "]";
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
