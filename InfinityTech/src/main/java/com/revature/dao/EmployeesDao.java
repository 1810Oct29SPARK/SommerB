package com.revature.dao;

import java.util.List;

import com.revature.beans.Employees;

public interface EmployeesDao {
	public Employees getEmployeesById(int id);

	public List<Employees> getEmployeess();

	public List<Employees> getEmployeessByBossId(int id);

	public void createEmployees(Employees e);

	public void updateEmployees(Employees e);

	public void deleteEmployees(Employees e);

	public Employees loginEmployees(String user, String pass);
}
