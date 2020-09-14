package com.manipal.model;

public class Conversion {
	int id;
	String from;
	String to;
	double multiple;
	public Conversion() {
		super();
	}
	public Conversion(int id, String from, String to) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiple = getMultiple();
	}
	
	@Override
	public String toString() {
		return "Conversion [id=" + id + ", from=" + from + ", to=" + to + ", multiple=" + multiple + "]";
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
		if(from.equals("CG") && to.equals("FAH")) {
			return (double)9/5;
		}
		else if(from.equals("FAH") && to.equals("CG")) {
			return (double)5/9;
		}
		return 1;
	}
	public void setMultiple(double multiple) {
		this.multiple = multiple;
	}
	
	
	
}	
