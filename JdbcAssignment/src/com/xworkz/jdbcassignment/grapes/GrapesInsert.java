package com.xworkz.jdbcassignment.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grapes","root","sharan@1997");
		
		
		System.out.println(connection);
	
		String insert2 = "insert into grapesinfo values('2','seed',600.0,'big');";
		
		
		String insert3 = "insert into grapesinfo values('3','seedless',800.0,'small');";
		String insert4 = "insert into grapesinfo values('4','seed',700.0,'big');";
		
		
		
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(insert2);
		int affected2 = statement.executeUpdate(insert3);
		int affected3 = statement.executeUpdate(insert4);
	
	
		
		
		System.out.println("affected:"+affected1);
		System.out.println("affected:"+affected2);
		System.out.println("affected:"+affected3);
		
		
	}

}
