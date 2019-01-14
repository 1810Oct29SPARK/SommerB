package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.beans.Employees;
import com.revature.service.EmployeesService;
import com.revature.service.EmployeesServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ObjectMapper om;
	private EmployeesService employeesService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		employeesService = new EmployeesServiceImpl();
		om = new ObjectMapper();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// note: if we had more than 2 choices, we should A B S O L U T E L Y use a
		// front controller pattern or some sort of helper class;
		switch (request.getRequestURI()) {
		case "/InfinityTech/employee":
			int id = Integer.parseInt(request.getParameter("id"));
			response.getWriter().write(om.writeValueAsString(employeesService.getEmployeesById(id)));
			break;
		case "/InfinityTech/employees":
			response.getWriter().write(om.writeValueAsString(employeesService.getEmployees()));
			break;
		case "/InfinityTech/employeesByBoss":
			int bId = Integer.parseInt(request.getParameter("id"));
			response.getWriter().write(om.writeValueAsString(employeesService.getEmployeesById(bId)));
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println(om.readValue(request.getReader(), Employees.class));
		employeesService.createEmployees(om.readValue(request.getReader(), Employees.class));
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeesService.updateEmployees(om.readValue(request.getReader(), Employees.class));
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeesService.deleteEmployees(om.readValue(request.getReader(), Employees.class));
	}

}
