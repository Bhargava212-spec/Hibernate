package com.pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user100")
public class User1 {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="user_id")
	private int id;
   @Column(name="user_name")
	private String name;
	
   @OneToMany(cascade=CascadeType.ALL)
   @JoinTable(name="user_vehicle",joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="vehicle_id"))
   private List<Vehicle1> vehicle1= new ArrayList<Vehicle1>();

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

public List<Vehicle1> getVehicle1() {
	return vehicle1;
}

public void setVehicle1(List<Vehicle1> vehicle1) {
	this.vehicle1 = vehicle1;
}

public User1(int id, String name, List<Vehicle1> vehicle1) {
	super();
	this.id = id;
	this.name = name;
	this.vehicle1 = vehicle1;
}

public User1() {
	super();
	
}
   
}
