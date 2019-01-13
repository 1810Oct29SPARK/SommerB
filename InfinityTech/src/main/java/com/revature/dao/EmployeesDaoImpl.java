package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.util.ConnectionUtil;

public class EmployeesDaoImpl implements EmployeesDao {

	private static final String filename = "connection.properties";
	
	@Override
	public Employees loginEmployees(String user, String pass) {
		Employees m = null;
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM EMPLOYEES WHERE FIRSTNAME = ? AND PASSWORD = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int eId = rs.getInt("ID");
				String eFirst = rs.getString("FIRSTNAME");
				String eLast = rs.getString("LASTNAME");
				String eMail = rs.getString("EMAIL");
				String ePw = rs.getString("PASSWORD");
				String eBoss = rs.getString("ISBOSS");
				int eBossId = rs.getInt("BOSSID");
				m = new Employees(eId, eFirst, eLast, eMail, ePw, eBoss, eBossId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public Employees getEmployeesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getEmployeess() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getEmployeessByBossId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createEmployees(Employees e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployees(Employees e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployees(Employees e) {
		// TODO Auto-generated method stub
		
	}
}