package com.xworkz.jdbcassignment.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root",
				"sharan@1997");

		System.out.println(connection);

		String insert = "insert into perfume_info values(2,'fog',100.0,'black','perfume')";
		String insert1 = "insert into perfume_info values(3,'ks',150.0,'green','bodyspray')";
		String insert2 = "insert into perfume_info values(4,'nothing',300.0,'pink','perfume')";
		String insert3 = "insert into perfume_info values(5,'fog',400.0,'red','bodyspray')";
		String insert4 = "insert into perfume_info values(6,'denim',500.0,'black','perfume')";
		String insert5 = "insert into perfume_info values(7,'denver',600.0,'black','bodyspray')";
		String insert6 = "insert into perfume_info values(8,'attar',150.0,'black','perfume')";
		String insert7 = "insert into perfume_info values(9,'fog',160.0,'black','bodyspray')";
		String insert8 = "insert into perfume_info values(10,'denim',170.0,'black','perfume')";

		Statement statement = connection.createStatement();

		int affected1 = statement.executeUpdate(insert1);
		int affected2 = statement.executeUpdate(insert2);
		int affected3 = statement.executeUpdate(insert3);
		int affected4 = statement.executeUpdate(insert4);
		int affected5 = statement.executeUpdate(insert5);
		int affected6 = statement.executeUpdate(insert6);
		int affected7 = statement.executeUpdate(insert7);
		int affected8 = statement.executeUpdate(insert8);

		System.out.println("affected:" + affected1);
		System.out.println("affected:" + affected2);
		System.out.println("affected:" + affected3);
		System.out.println("affected:" + affected4);
		System.out.println("affected:" + affected5);
		System.out.println("affected:" + affected6);
		System.out.println("affected:" + affected7);
		System.out.println("affected:" + affected8);

	}

}
