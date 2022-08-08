package com.xworkz.java_core.string;

public class StringDemo {
	public static void main(String[] args) {
		
		String name = "sharan";
		String name1 = "sharan";
		System.out.println(name==name1);
		
		String s = new String("shadow");
		String interns=s.intern();
		System.out.println(s==interns);
		
		String shad = "shadow";
		System.out.println(interns==shad);
				
	    name1="beast";
		System.out.println(name==name1);
				
		String name2 = new String ("sharan");
		System.out.println(name1==name2);
				
		
	}

}
