package com.revature.service;

import java.util.List;

import com.revature.beans.Employees;

public interface EmployeesService {

	public Employees getEmployeesById(int id);

	public List<Employees> getEmployees();

	public List<Employees> getEmployeesByBossId(int id);

	public void createEmployees(Employees e);

	public void updateEmployees(Employees e);

	public void deleteEmployees(Employees e);

	public Employees loginEmployees(String user, String pass);
}
