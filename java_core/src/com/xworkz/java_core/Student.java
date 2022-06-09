package com.xworkz.java_core;

public class Student {
String name;
int rollno;
void show() {
	System.out.println(name+" " +rollno);
}
public static void main(String[] args) {
	Student s = new Student();
	s.show();
	
		
}
}
