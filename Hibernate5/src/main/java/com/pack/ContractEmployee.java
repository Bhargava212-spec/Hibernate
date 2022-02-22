package com.pack;

public class ContractEmployee  extends Employee{
   private int pay_per_hour;
   private int duration;
public int getPay_per_hour() {
	return pay_per_hour;
}
public void setPay_per_hour(int pay_per_hour) {
	this.pay_per_hour = pay_per_hour;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public ContractEmployee(int id, String name, int pay_per_hour, int duration) {
	super(id, name);
	this.pay_per_hour = pay_per_hour;
	this.duration = duration;
}
public ContractEmployee() {
	super();
	
}
public ContractEmployee(int id, String name) {
	super(id, name);
	
}
   
}
