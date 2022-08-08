package com.xworkz.java_core.casting;

public class NonPrimitiveTypeCasting {
	public static void main(String[] args) {
		System.out.println("Main started ");
		
		
		//up casting
		Animal animal = new Tiger();
		
		// down casting
		
		Tiger tiger = (Tiger)animal;
		System.out.println("main ended");
	}

}
