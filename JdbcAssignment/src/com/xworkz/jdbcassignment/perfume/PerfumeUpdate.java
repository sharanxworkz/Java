package com.xworkz.jdbcassignment.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume","root","sharan@1997");
		
		
		System.out.println(connection);
		
		String update = "update perfume_info set name ='jaguar' where price=400";
		
		
		
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(update);
		
		System.out.println("affected:"+affected1);
		
		
	}
		
		
	
	
		
	

}
