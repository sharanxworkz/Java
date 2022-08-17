package com.xworkz.interview;

public class Palindrome {
	public static void main(String[] args) {
		int num= 123;
		int temp = num;
		int rev = 0,rem;
		
		while (temp!=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			
			
		}
		if (rev==num) {
			System.out.println("it is a palindrome");
			
		} else {
			System.out.println("it is not a palindrome");

		}
		
	}

}
