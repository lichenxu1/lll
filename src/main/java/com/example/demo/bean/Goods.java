package com.example.demo.bean;

import java.io.Serializable;

public class Goods implements Serializable{
	
	private int id;
	
	private String name;
	
	private double price;
	
	private String sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}
	
	

}
