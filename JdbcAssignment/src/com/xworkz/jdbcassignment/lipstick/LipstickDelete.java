package com.xworkz.jdbcassignment.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","sharan@1997");
		
		
		System.out.println(connection);
		
		String delete = "delete from lipstick_info where name='sheril'";

		
		
		
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(delete);
		
		System.out.println("affected:"+affected1);
		
	

}

}
