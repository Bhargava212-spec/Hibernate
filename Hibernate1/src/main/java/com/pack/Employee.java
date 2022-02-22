package com.pack;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private String address;
    private String qualification;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Employee(int empId, String name, double salary, String address, String qualification) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.qualification = qualification;
	}
	public Employee() {
		super();


	}
    
}
