package com.pack;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regemp161")
@PrimaryKeyJoinColumn(name="id")
public class RegularEmployee1 extends Employee1 {
	
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
public RegularEmployee1(int id, String name, double salary, double bonus) {
	super(id, name);
	this.salary = salary;
	this.bonus = bonus;
}
public RegularEmployee1() {
	super();
	
}
public RegularEmployee1(int id, String name) {
	super(id, name);

}
   
   
}
