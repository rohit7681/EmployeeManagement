package com.ty.Employee.Entity;

public class Employee {
	private int id ;
	private String name ;
	private int age ;
	private String email ;
	private double Sal ;
	public Employee(int id, String name, int age, String email, double sal) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		Sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	
}
