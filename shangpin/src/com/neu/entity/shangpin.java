package com.neu.entity;

public class shangpin {
	private String name;
	private Double price;
	private Integer num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public shangpin(String name, Double price, Integer num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public shangpin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
