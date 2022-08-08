package com.xworkz.dummy.dummyDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.dummy.constants.Dbproperties.*;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.dummy.constants.Brand;
import com.xworkz.dummy.dummyDTO.PenDTO;

public class PenDAOImpl implements PenDAO {

	@Override
	public Boolean save(PenDTO penDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String sql = "insert into pen_info values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, penDTO.getId());
			preparedStatement.setString(2, penDTO.getBrand().getBrand());
			preparedStatement.setString(3,penDTO.getColor());
			preparedStatement.setInt(4, penDTO.getPrice());
			Integer noOfRowsAffected = preparedStatement.executeUpdate();
				System.out.println(noOfRowsAffected);
				if(noOfRowsAffected>0) {
					System.out.println("inserted "+ noOfRowsAffected);
				}
				else {
					System.out.println("not inserted");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PenDTO getDetails(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = "select * from pen_info where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultset = preparedStatement.executeQuery();
			while(resultset.next()) {
				Integer cid = resultset.getInt(1);
				String brand = resultset.getString(2);
				String color = resultset.getString(3);
				Integer price = resultset.getInt(4);
				
				PenDTO penDTO = new PenDTO();
				penDTO.setId(cid);
				penDTO.setBrand(Brand.getByValue(brand));
				penDTO.setColor(color);
				penDTO.setPrice(price);
				return penDTO;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
