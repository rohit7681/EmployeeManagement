package com.ty.Employee.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.ty.Employee.Entity.Employee;

public class EmployeeService {
	private static String url="jdbc:mysql://localhost:3306/employee";
	private static String user="root";
	private static String pwd="9938";
	public static Connection con=null;
	public static int no=0;
	public static int no1=0;
	public static int no2=0;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public int add(Employee e1)  {
		String sql="insert into employee values(?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, e1.getId());
			pstm.setString(2, e1.getName());
			pstm.setInt(3, e1.getAge());
			pstm.setString(4, e1.getEmail());
			pstm.setDouble(5, e1.getSal());
			 no=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return no;
	}
	
	public static int update(Employee e1) {
		String query1="update employee set name=?,age=?,email=?,sal =? where id=? ";
		try {
			PreparedStatement pstm=con.prepareStatement(query1);
			pstm.setString(1, e1.getName());
			pstm.setInt(2, e1.getAge());
			pstm.setString(3, e1.getEmail());
			pstm.setDouble(4, e1.getSal());
			pstm.setInt(5, e1.getId());
			 no1=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return no1; 
	}
	
	public int delete(int id) {
		String query2="delete from employee where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query2);
			pstm.setInt(1, id);
			 no2=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return no2;
	}
}
