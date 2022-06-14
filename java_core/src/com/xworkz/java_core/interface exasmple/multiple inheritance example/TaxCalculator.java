package com.xworkz.java_core;

public class TaxCalculator implements StateTax,CentralTax {

	@Override
	public void petrolTax() {
		System.out.println("petrol tax is 10 rs");
		
	}

	@Override
	public void electricityTax() {
		System.out.println("electricity tax is 5 rs");
		
		
	}
	

}
