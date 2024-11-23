package com.ty.Employee.Controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Employee.Service.EmployeeService;
@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1=req.getParameter("id");
		int id=Integer.parseInt(id1);
		EmployeeService emp=new EmployeeService();
		int no=emp.delete(id);
		if(no>0) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome.html");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("Delete.html");
			rd.include(req, resp);
		}
	}
}
