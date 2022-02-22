package com.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="con_emp")
public class ContractEmployee1 extends Employee1 {
	  
	private  int pay_per_hour;
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
	public ContractEmployee1(int id, String name, int pay_per_hour, int duration) {
		super(id, name);
		this.pay_per_hour = pay_per_hour;
		this.duration = duration;
	}
	public ContractEmployee1() {
		super();
		
	}
	public ContractEmployee1(int id, String name) {
		super(id, name);
		
	}
	

}
