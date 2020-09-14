package com.manipal.model;

public class tempCalculatorBean {
	int id;
	String from;
	String to;
	double multiple;
	int unit;
	double totalUnits;
	public tempCalculatorBean() {
		super();
	}
	public tempCalculatorBean(int id, String from, String to, double multiple, int unit, double totalUnits) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiple = multiple;
		this.unit = unit;
		this.totalUnits = totalUnits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getMultiple() {
		return multiple;
	}
	public void setMultiple(double multiple) {
		this.multiple = multiple;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public double getTotalUnits() {
		return totalUnits;
	}
	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}
	
	
	
}
