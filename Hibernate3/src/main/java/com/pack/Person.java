package com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="per1000")
@IdClass(CompositeId.class)
public class Person {
	@Id
	private int pid;
	private String name;
	private int age;
	@Id
	private int phoneNumber;
	private String address;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, int age, int phoneNumber, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
}
