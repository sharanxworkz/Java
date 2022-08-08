package com.xworkz.java_core.Typecasting;
	

class Stud {
int id;
String name;

void details(int r,String g){
id = r;
name = g;
}
void displayInformation(){
System.out.println(id +" "+ name);
}
}
class StudentInfo{
public static void main(String args[]){
Stud s1 = new Stud();
s1.details(5,"sharan");
s1.displayInformation();
}
}
