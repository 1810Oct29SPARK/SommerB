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
			String sql = "INSERT INTO REIMBURSMENT(AMOUNT, DESCRIPTION, EID) VALUES(?,?,?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1,a.getAmount());
			p.setString(2, a.getDescription());
			p.setInt(3, a.geteId());
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
		List<Reimbursement> ac = new ArrayList<>();

		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM ACCOUNTS WHERE E_ID = ?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				int aId = rs.getInt("A_ID");
				int eId = rs.getInt("E_ID");
				int amount = rs.getInt("AMOUNT");
				Blob photo = rs.getBlob("PHOTO");
				String descrip = rs.getString("DESCRIPTIONS");
				String status = rs.getString("STATUS");
				ac.add(new Reimbursement(id, amount, descrip, status, eId));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ac;
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
