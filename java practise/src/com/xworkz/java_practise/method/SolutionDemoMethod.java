package com.xworkz.java_practise.method;

public class SolutionDemoMethod {
	public static void main(String[] args) {
		Solution s = new Solution();
			s.m1();
			s.m2("sharan",24);
		int result=	s.m3();
		System.out.println(result);
		System.out.println(s.m3());
		int g=s.m4(10, 15);
		System.out.println(g);
		System.out.println(s.m4(5, 5));
	}

}
