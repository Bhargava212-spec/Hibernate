package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veh1000")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Vehicle_Id")
	private int id;
	@Column(name="Vehicle_Name")
	private String name;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
