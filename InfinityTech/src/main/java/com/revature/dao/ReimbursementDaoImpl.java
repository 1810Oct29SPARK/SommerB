package com.revature.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.util.ConnectionUtil;

public class ReimbursementDaoImpl implements ReimbursementDao{

	private static final String filename = "connection.properties";
	
	@Override
	public void createRequest(Reimbursement a) {
		try(Connection con = ConnectionUtil.getConnection(filename)){
			String sql = "INSERT INTO REIMBURSMENT(ID, AMOUNT, DESCRIPTION) VALUES(?,?,?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1,a.getId());
			p.setInt(2, a.getAmount());
			p.setString(3, a.getDescription());
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteRequest(Reimbursement a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reimbursement> getReimbursementById(int id) {
		return null;
		
	}

	@Override
	public void updateRequest(Reimbursement a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reimbursement> viewPendingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> viewResolvedById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> viewEmployeePendingByBossId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> viewResolvedByBossId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
