package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veh100")
public class Vehicle1 {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     @Column(name="vehicle_id")
	private int id;
     @Column(name="vehicle_name")
	private String name;
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
	public Vehicle1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Vehicle1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
