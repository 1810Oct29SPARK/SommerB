package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Reimbursement;
import com.revature.service.ReimbursementService;
import com.revature.service.ReimbursementServiceImpl;

/**
 * Servlet implementation class ReimbursementServlet
 */
public class ReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ObjectMapper om;
	private ReimbursementService rs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public ReimbursementServlet() {
		rs = new ReimbursementServiceImpl();
		om = new ObjectMapper();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {;
		Reimbursement reim = new Reimbursement();
		reim.setId(Integer.parseInt(request.getParameter("id")));
		reim.setAmount(Integer.parseInt(request.getParameter("amount")));
		reim.setDescription(request.getParameter("description"));
		rs.createRequest(reim);
		
		response.sendRedirect("employeeHome.html");
		
	}

}
