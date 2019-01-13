package com.revature.service;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.dao.EmployeesDao;
import com.revature.dao.EmployeesDaoImpl;

public class EmployeesServiceImpl implements EmployeesService{
	
	private EmployeesDao ed = new EmployeesDaoImpl();
	@Override
	public Employees getEmployeesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getEmployeesByBossId(int id) {
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

	@Override
	public Employees loginEmployees(String user, String pass) {
		
		return ed.loginEmployees(user, pass);
	}

}
