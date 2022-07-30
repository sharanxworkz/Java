package com.xworkz.jdbcassignment.Cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cigarette","root","sharan@1997");
		
		
		System.out.println(connection);
	
		String insert1 = "insert into cigarette_detail values(3,'flake','king','america',10)";
		String insert2 = "insert into cigarette_detail values(4,'wils','small','china',35)";
		String insert3 = "insert into cigarette_detail values(5,'lights','ecigar','usa',15)";
		String insert4 = "insert into cigarette_detail values(6,'classic','medium','india',25)";
		String insert5 = "insert into cigarette_detail values(7,'royal','king','usa',30)";
		String insert6 = "insert into cigarette_detail values(8,'scissors','small','japan',40)";
		String insert7 = "insert into cigarette_detail values(9,'players','electronic','srilanka',50)";
		String insert8 = "insert into cigarette_detail values(10,'navycut','king','indian',6)";
		
		
		
		Statement statement = connection.createStatement();
		
		int affected1 = statement.executeUpdate(insert1);
		int affected2 = statement.executeUpdate(insert2);
		int affected3 = statement.executeUpdate(insert3);
		int affected4 = statement.executeUpdate(insert4);
		int affected5 = statement.executeUpdate(insert5);
		int affected6 = statement.executeUpdate(insert6);
		int affected7 = statement.executeUpdate(insert7);
		int affected8 = statement.executeUpdate(insert8);
		
		
		System.out.println("affected:"+affected1);
		System.out.println("affected:"+affected2);
		System.out.println("affected:"+affected3);
		System.out.println("affected:"+affected4);
		System.out.println("affected:"+affected5);
		System.out.println("affected:"+affected6);
		System.out.println("affected:"+affected7);
		System.out.println("affected:"+affected8);
		
	}

}
