package com.xworkz.java_practise.method;

public class Addition {
	/* method with argument and without return statment*/
	
     void  add(int a ,int b ){
    	 int sum = a+b;
    //	 System.out.println("the sum of a+b is" + " "+""+a +" "+ b+" "+"="+sum);
		System.out.println(a+b);
		
	}
     public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(10, 15);
	    addition.add(5, 6);
			
	}

}
