package com.xworkz.java_core;

public class DogShop {
	int price;
	String breed;
	String origin;
	int height;
	String color;
	DogShop(int a, String b, String c){
		price = a;
		breed = b;
		origin = c;
	}
	DogShop(int d, String e){
		height = d;
		color = e;
	}
	void petDetails() {
		
		System.out.println(price + breed + origin + height + color);
	}
	
public static void main(String[] args) {
	DogShop s = new DogShop (5000,"lebrodol","all climate");
	DogShop s1 = new DogShop (5,"white");
	//DogShop s2 = new DogShop();
	s.petDetails();
	s1.petDetails();
//	System.out.println(s.price);
//	System.out.println(s.breed);
//	System.out.println(s.origin);
//	System.out.println(s1.height);;
//	System.out.println(s1.color);
	
	
}
}
