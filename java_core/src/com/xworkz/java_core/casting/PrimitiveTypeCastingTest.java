package com.xworkz.java_core.casting;

public class PrimitiveTypeCastingTest {
public static void main(String[] args) {
	byte b =10;
	short s = b;
	System.out.println(b);
	System.out.println(s);
	
	
	short s1 =32;
	byte b1 = (byte)s1;
	System.out.println("b1:"+b1);
	System.out.println(s1);
}

}
