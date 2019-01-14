package com.revature.service;

import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.dao.ReimbursementDao;
import com.revature.dao.ReimbursementDaoImpl;

public class ReimbursementServiceImpl implements ReimbursementService {

	ReimbursementDao rd = new ReimbursementDaoImpl();
	
	@Override
	public void createRequest(Reimbursement a) {
		rd.createRequest(a);
	}

	@Override
	public List<Reimbursement> getReimbursementById(int id) {
		return rd.getReimbursementById(id);
	}

}
