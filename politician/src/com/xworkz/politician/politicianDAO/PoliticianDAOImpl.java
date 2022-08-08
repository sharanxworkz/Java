package com.xworkz.politician.politicianDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.politician.constants.Dbcredentials;
import com.xworkz.politician.politicianDTO.PoliticianDTO;

public class PoliticianDAOImpl implements PoliticianDAO {
	public void save(PoliticianDTO dto) {
		try {
			Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),
					Dbcredentials.USERNAME.getValue(), Dbcredentials.SECRET.getValue());
			String sql = "insert into politician.ploiticiandetails values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement prestat = connection.prepareStatement(sql);
			prestat.setInt(1, dto.getId());
			prestat.setString(2, dto.getName());
			prestat.setString(3, dto.getPresident());
			prestat.setDouble(4, dto.getTotalMembers());
			prestat.setString(5, dto.getPartySymbol());
			prestat.setString(6, dto.getPartyLocation());
			prestat.setString(7, dto.getPartyColor());
			prestat.setString(8, dto.getPartyState());
			prestat.setInt(9, dto.getPartyBudget());
			int noOfRowsAffected = prestat.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The Values Inserted Are :" + sql);
				System.out.println(noOfRowsAffected);
			} else {
				System.out.println("Unable to insert Data..!!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// return rowsaffected == 1 ? true:false;p0

	}

	public PoliticianDTO findById(int id) {

		// TODO Auto-generated method stub
		return null;
	}

	public PoliticianDTO findByIdAndPresident(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public PoliticianDTO findByIdAndAndName(int id, String name, String president) {
		// TODO Auto-generated method stub
		return null;
	}

	public PoliticianDTO findByIdName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String findNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String friendPresidentByIdAndName(String name, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public PoliticianDTO findPartyByMaxMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
