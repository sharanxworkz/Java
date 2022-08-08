package com.xworkz.java_practise;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value of a:");
		int a = scan.nextInt();
		
		System.out.println("enter value of b:");
		int b = scan.nextInt();
		
		System.out.println(a+b);
		scan.close();
		
	}

}
