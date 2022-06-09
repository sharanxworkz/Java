package com.xworkz.java_core;

public class Example {
	String name;
	int age;
	Example(){
		name = "sharan";
		age = 24;
	}
	Example(String str , int a) {
		name = str;
		age = a;
		
	}
	public static void main(String[] args) {
		Example s = new Example();
		Example s1 = new Example("amana",25);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s1.age);
		System.out.println(s1.name);
		
	}

}
