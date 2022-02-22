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
@Table(name="vehicle100")
public class Vehicle2 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vehicle_id")
	private int id;
	@Column(name="vehicle_name")
	private String name;
	@ManyToMany(mappedBy="vehicle")
	private List<User2> user=new ArrayList<User2>();
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
	public List<User2> getUser() {
		return user;
	}
	public void setUser(List<User2> user) {
		this.user = user;
	}
	public Vehicle2(int id, String name, List<User2> user) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
	}
	public Vehicle2() {
		super();
		
	}
	

}
