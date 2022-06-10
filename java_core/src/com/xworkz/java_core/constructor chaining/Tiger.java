package com.xworkz.java_core;

public class Tiger {
	String name;
	String color;
	String gender;
	
	Tiger(){
		this("leo","white","female");
	}
	
	Tiger(String name, String clr){
		this.name = name;
		this.color = clr;
		System.out.println("tiger likes to eat");
	}
	
	Tiger(String name,String clr, String gender){
		this("rio","orange");
		this.name = name;
		this.color = clr;
		System.out.println("tiger likes to play");
	}
	

}
