package com.xworkz.basketball;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketballRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextconfig.xml");
		System.out.println(context);
		Basketball basket = context.getBean(Basketball.class);
		System.out.println(basket.basketballName);
		System.out.println(basket.isAirFilled);
		
		      Integer integer = context.getBean(Integer.class);
		      System.out.println(integer);
		      
		      String string = context.getBean(String.class);
		      System.out.println(string);
		      
		     Double doubles = context.getBean(Double.class);
		     System.out.println(doubles);
		     
		   Float floats = context.getBean(Float.class);
		     System.out.println(floats);
		     
		     Boolean booleans = context.getBean(Boolean.class);
		     System.out.println(booleans);
		    
		      
	}

}
