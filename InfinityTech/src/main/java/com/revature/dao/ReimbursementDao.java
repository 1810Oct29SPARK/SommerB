package com.revature.dao;

import java.util.List;

import com.revature.beans.Reimbursement;

public interface ReimbursementDao {
public void createRequest(Reimbursement a);
    
    public void deleteRequest(Reimbursement a);
    
    public List<Reimbursement> getReimbursementById(int id);
    
    public void updateRequest(Reimbursement a);
    
    public List<Reimbursement> viewPendingById(int id);
    
    public List<Reimbursement> viewResolvedById(int id);
    
    public List<Reimbursement> viewEmployeePendingByBossId(int id);
    
    public List<Reimbursement> viewResolvedByBossId(int id);
}
