package com.pack;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="user1000")
public class User {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     @Column(name="user_id")
     
	 private int id;
     @Column(name="user_name")
	 private String name;
     
     @OneToOne(cascade=CascadeType.ALL)
     @JoinColumn(name="vehicle_id")
     private Vehicle vehicle;

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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public User(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	 
}
