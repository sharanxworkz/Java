package com.xworkz.jdbcpractise.pillowDTO;

import com.xworkz.jdbcpractise.constants.PillowType;

public class PillowDTO {
	private int id;
	private String brand;
	private PillowType type;
	private double price;
	
	public PillowDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public PillowType getType() {
		return type;
	}

	public void setType(PillowType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PillowDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	

}
