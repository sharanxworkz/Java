package com.xworkz.jdbcassignment.Cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cigarette","root","sharan@1997");
		
		
		System.out.println(connection);
		
		String update = "update cigarette_detail set brand ='indian' where price=20";
		String update1 = "update cigarette_detail set name ='sharan' where price=10";
		
		
		
		
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(update);
		
		int affected2 = statement.executeUpdate(update1);
		
		System.out.println("affected:"+affected1);
		System.out.println("affected:"+affected2);
		
		
	}
		
		
	
	

}
