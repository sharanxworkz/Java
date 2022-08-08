package com.xworkz.jdbcassignment.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class PerfumeRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root",
				"sharan@1997");

		System.out.println(connection);
		String sql = " select * from perfume_info";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(sql);
		System.out.println(resultset);

		AtomicInteger auto = new AtomicInteger();
		while (resultset.next()) {
			int count = auto.incrementAndGet();

			int id = resultset.getInt(1);
			String name = resultset.getString(2);
			Double price = resultset.getDouble(3);
			String type = resultset.getString(4);
			String color = resultset.getString(5);

			System.out.println(id + " " + name + " " + price + " " + type + " " + color);

		}
		System.out.println(auto.get());

	}

}
