package org;

public class Student {
	String name;
	int id;
	
	Student(String name,int id){
		this.name=name;
		this.id = id;
		
	}
//	public String toString() {
//		return "name:"+this.name+" " +"id:"+this.id;
//	}
	public static void main(String[] args) {
		Student s = new Student("sharan",20);
		System.out.println(s);
	}

}
