package com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp141")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee1 {
	@Id
	private int id;
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
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

}