package com.revature.service;

import java.util.List;

import com.revature.beans.Reimbursement;

public interface ReimbursementService {
	
	public void createRequest(Reimbursement a);

	public List<Reimbursement> getReimbursementById(int id);
	
}

