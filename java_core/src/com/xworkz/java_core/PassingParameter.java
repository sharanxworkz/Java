package com.xworkz.java_core;

public class PassingParameter {
String name;
int age;
PassingParameter(String x,int y){
	name = x;
	age = y;
	System.out.println(name+age);
}

public static void main(String[] args) {
	PassingParameter s = new PassingParameter("sharan",20);
	
	
}

}
