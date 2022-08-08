package ScannerClass.scannerdemo;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value of a:");
		int a = scan.nextInt();
		System.out.println("enter value of b:");
		int b = scan.nextInt();
		
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont divide by zero");
		}
		
		
		scan.close();
			
	}

}
