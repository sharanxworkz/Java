package com.xworkz.java_core;

public class Dog {
	String name;
	String color;

	
	Dog(){
		this("charlie","white");

	}
	
	Dog(String name, String clr){
		this.name = name;
		this.color = clr;
		System.out.println("Dog likes to play");
	}
}
