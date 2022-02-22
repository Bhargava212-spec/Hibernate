package com.pack;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp122")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="empType",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="emp")
public class Employee1 {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
