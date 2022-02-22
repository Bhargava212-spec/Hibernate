package com.pack;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp2000")
public class Employee {
	
	private String location;
	@EmbeddedId   
	@AttributeOverride(name="id" , column=@Column(name="EmployeeId"))
	private EmployeeDetails empDetails;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
	public Employee(String location, EmployeeDetails empDetails) {
		super();
		this.location = location;
		this.empDetails = empDetails;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
