package com.xworkz.java_core;

public class IfElseMethodAssignment {
	static void vote(int age) {
		if(age<=20) {
			System.out.println("your are eligible to vote");
		}
		else {
			System.out.println("your are not eligible");
		}
		
		
	}
	public static void main(String[] args) {
		vote( 20);
	}

}
