package com.xworkz.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root" ,"sharan@1997");
				System.out.println(connection);
				
			String insert = 	"insert into employee_info values(3,'amana','male',5454)";
			String insert1=     "insert into employee_info values(4,'poorni','female',0054)";
			Statement statement = connection.createStatement();
			
			int affected= statement.executeUpdate(insert);
			int affected1 = statement.executeUpdate(insert1);
			System.out.println(affected);
			
			System.out.println(affected1);
			
			
			
	}

}
