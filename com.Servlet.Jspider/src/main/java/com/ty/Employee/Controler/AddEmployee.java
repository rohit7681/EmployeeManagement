package com.ty.Employee.Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Employee.Entity.Employee;
import com.ty.Employee.Service.EmployeeService;

@WebServlet("/add")
public class AddEmployee extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1=req.getParameter("id");
		int id=Integer.parseInt(id1);
		String name=req.getParameter("name");
		String age1=req.getParameter("age");
		int age=Integer.parseInt(age1);
		String email=req.getParameter("email");
		String sal1=req.getParameter("salary");
		double sal=Double.parseDouble(sal1);
		Employee e1=new Employee(id,name,age,email,sal);
		EmployeeService emp=new EmployeeService();
		
		int no=emp.add(e1);
		if(no>0) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome.html");
			rd.forward(req, resp);
		}
		else {
			PrintWriter out=resp.getWriter();
			RequestDispatcher rd=req.getRequestDispatcher("InvalidRegister.html");
			rd.forward(req, resp);
		}
		
	}
	
}
