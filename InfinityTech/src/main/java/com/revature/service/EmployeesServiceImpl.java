package com.revature.service;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.dao.EmployeesDao;
import com.revature.dao.EmployeesDaoImpl;

public class EmployeesServiceImpl implements EmployeesService{
	
	private EmployeesDao ed = new EmployeesDaoImpl();
	@Override
	public Employees getEmployeesById(int id) {
		return ed.getEmployeesById(id);
	}

	@Override
	public List<Employees> getEmployees() {
		return ed.getEmployeess();
	}

	@Override
	public List<Employees> getEmployeesByBossId(int id) {
		return ed.getEmployeessByBossId(id);
	}

	@Override
	public void createEmployees(Employees e) {
		ed.createEmployees(e);
	}

	@Override
	public void updateEmployees(Employees e) {
		ed.updateEmployees(e);
	}

	@Override
	public void deleteEmployees(Employees e) {
		ed.deleteEmployees(e);
	}

	@Override
	public Employees loginEmployees(String user, String pass) {
		
		return ed.loginEmployees(user, pass);
	}

}
