package com.pack;

public class ContractEmployee extends Employee{
	private String name;
  public ContractEmployee(String name) {
		super();
		this.name = name;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
public ContractEmployee(int pay_per_hour, int duration) {
	super();
	this.name=name;
	this.pay_per_hour = pay_per_hour;
	this.duration = duration;
}
public ContractEmployee() {
	super();

}
  
}
