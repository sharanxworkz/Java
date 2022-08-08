package com.xworkz.practisejar;

public class BookRunner {
public static void main(String[] args) {
	System.out.println("this is runner method of book");
	Book book1 = new Book();
	
	Book book = new Book("amana",20);

	int i = book.id;
	System.out.println(i);
	
	System.out.println(book.name);
	String a =book.value();
	
	
	
	System.out.println(a);
		
}
}
