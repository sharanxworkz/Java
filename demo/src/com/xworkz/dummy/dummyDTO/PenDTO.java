package com.xworkz.dummy.dummyDTO;

import com.xworkz.dummy.constants.Brand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PenDTO {
	
	private Integer id;
	private Brand brand;
	private String color;
	private Integer price;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public PenDTO() {
		
	}
	public PenDTO(Integer id, Brand brand, String color, Integer price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "PenDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

	
		
}
