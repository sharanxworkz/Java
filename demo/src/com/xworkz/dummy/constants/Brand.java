package com.xworkz.dummy.constants;

public enum Brand {
	
	
	BALLPEN("BallPen"),INK("Ink pen"),JEL("Jel Pen");
	
	
	private String brand;
	
	private Brand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	public static Brand getByValue(String brand) {
		Brand[] brands = Brand.values();
		for (Brand brand2 : brands) {
			if(brand2.brand.equals(brand)) {
				return brand2;
			}
		}
		
		return null;
		
	}

	
	
	
	

}
