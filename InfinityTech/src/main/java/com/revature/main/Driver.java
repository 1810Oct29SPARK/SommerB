package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.EmployeesDao;
import com.revature.dao.EmployeesDaoImpl;
import com.revature.service.EmployeesService;
import com.revature.service.EmployeesServiceImpl;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
//		init();
		EmployeesDao ed = new EmployeesDaoImpl(); 
		EmployeesService es = new EmployeesServiceImpl();
//		System.out.println(ed.loginEmployees("Laney", "dzcYSy2"));
		System.out.println(es.loginEmployees("Laney", "dzcYSy2"));
		
	}

	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
