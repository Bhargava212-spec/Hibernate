
package com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="stud2000")
@NamedQueries({
	@NamedQuery(name="findStudent",query="from Student st"),
	@NamedQuery(name="findStudentByName",query="select st.name from Student st where st.id=:stuid")
})
@NamedNativeQueries(value= {
		@NamedNativeQuery(name="findAllStudent",query="select * from stud2000",resultClass=Student.class),
		@NamedNativeQuery(name="findById",query="select * from stud2000 where id=?",resultClass=Student.class)
})
public class Student {
	@Id
    private int id;
    private String name;
   
    private int age;
    private String city;
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String address, int age, String city) {
		super();
		this.id = id;
		this.name = name;
	
		this.age = age;
		this.city = city;
	}
	public Student() {
		super();
	}
    
}