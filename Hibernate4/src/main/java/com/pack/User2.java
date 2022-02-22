package com.pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user2100")
public class User2 {
    @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
	private int id;
    @Column(name="user_name")
	private String name;
    @ManyToMany
    private List<Vehicle2> vehicle=new ArrayList<Vehicle2>();
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
	public List<Vehicle2> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle2> vehicle) {
		this.vehicle = vehicle;
	}
	public User2(int id, String name, List<Vehicle2> vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}
	public User2() {
		super();
		
	}
	
}
