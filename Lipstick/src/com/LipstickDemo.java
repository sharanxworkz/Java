package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","sharan@1997");
		
		
		System.out.println(connection);
		
		String insert = "insert into lipstick_info values(2,'colorbar','pink','liquid',300.0)";
		String insert1 = "insert into lipstick_info values(3,'meril','brown','solid',200.0)";
		String insert2 = "insert into lipstick_info values(4,'hooda','grey','bullet',100.0)";
		String insert3 = "insert into lipstick_info values(5,'herbs','green','liquid',150.0)";
		String insert4 = "insert into lipstick_info values(6,'arpita','violet','liquid',250.0)";
		String insert5 = "insert into lipstick_info values(7,'magu','purple','liquid',450.0)";
		String insert6 = "insert into lipstick_info values(8,'kanan nanayituntu','blonde','liquid',500.0)";
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(insert1);
		int affected2 = statement.executeUpdate(insert2);
		int affected3 = statement.executeUpdate(insert3);
		int affected4 = statement.executeUpdate(insert4);
		int affected5 = statement.executeUpdate(insert5);
		int affected6 = statement.executeUpdate(insert6);
		
		
		System.out.println("affected:"+affected1);
		System.out.println("affected:"+affected2);
		System.out.println("affected:"+affected3);
		System.out.println("affected:"+affected4);
		System.out.println("affected:"+affected5);
		System.out.println("affected:"+affected6);
		
		
	}

}
