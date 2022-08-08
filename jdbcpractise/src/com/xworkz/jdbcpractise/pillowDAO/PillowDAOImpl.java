package com.xworkz.jdbcpractise.pillowDAO;

import static com.xworkz.jdbcpractise.constants.Dbproperties.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbcpractise.pillowDTO.PillowDTO;

public class PillowDAOImpl implements PillowDAO{

	@Override
	public void save(PillowDTO pillowDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			String insert = "insert into pillow_info values(2,'duroflex','medium',200.0)";
			Statement statement = connection
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
