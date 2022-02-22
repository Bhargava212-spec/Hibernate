package com.pack;

public class RegularEmployee  extends Employee{
       private double salary;
       private double bonus;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public RegularEmployee(int id, String name, double salary, double bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegularEmployee() {
		super();
		
	}
	public RegularEmployee(int id, String name) {
		super(id, name);
		
	}
       
}
