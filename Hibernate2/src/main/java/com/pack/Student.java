package com.pack;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="stu1000")
@DynamicInsert(value=true)
@DynamicUpdate(value=true)
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="student_id")
	private Integer stuId;
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer stuId, String name, Integer age, double salary, Date dob, boolean status, Gender gender) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
		this.status = status;
		this.gender = gender;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Column(name="studentname")
	private String name;
	private Integer age;
	@Column(name="stusal",scale=7,precision=2)
	private double salary;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Transient
	private boolean status;
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;
	
}
