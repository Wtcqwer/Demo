package com.neu.entity;

public class adr {
	private String name;
	private String phone;
	private String adr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdr() {
		return adr;
	}
	public adr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public adr(String name, String phone, String adr) {
		super();
		this.name = name;
		this.phone = phone;
		this.adr = adr;
	}
	
}
