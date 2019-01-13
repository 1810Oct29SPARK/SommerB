package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Employees;
import com.revature.service.EmployeesService;
import com.revature.service.EmployeesServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EmployeesService employeesService;
	
	public LoginServlet() {
		employeesService = new EmployeesServiceImpl();
	}

	// return Login page for GET request
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("login.html").forward(req, resp);
	}

	// handle POST request from form on login.html
	// (or anywhere else)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("handling request...");
		// checks whether a session exists, otherwise creates a new one
		// overloaded version takes a boolean create param, if false it returns null if
		// no session exists for the current request
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		// grab params from request
		String user = req.getParameter("firstname");
		String pass = req.getParameter("password");
//		System.out.println(req.getParameter("firstname"));
//		System.out.println(req.getParameter("password"));
		// attempting to authenticate employee
		Employees e = employeesService.loginEmployees(user, pass);
		// set use information as session attributes
		if (e != null) {
			session.setAttribute("userId", e.getId());
			session.setAttribute("firstname", e.getFirstName());
			session.setAttribute("lastname", e.getLastName());
			session.setAttribute("email", e.getEmail());
			session.setAttribute("password", e.getPassword());
			session.setAttribute("manager", e.getIsBoss());
			session.setAttribute("boss", e.getBossId());
			session.setAttribute("problem", null);
			// redirect user to profile page if authenticated
			// if employee is a boss, redirect to manager page
			if (e.getIsBoss().equals("true")) {
				resp.sendRedirect("managerHome.html");
			} else {
				// if not, default to employee page
				resp.sendRedirect("employeeHome.html");
			}
		} else {
			session.setAttribute("problem", "invalid credentials");
			// redirect user to login page if authentication fails
			resp.sendRedirect("login");
		}

	}
}