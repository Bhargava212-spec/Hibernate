package com.pack;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mgr1000")
public class Manager {
@Id
private Integer mgrId;
@Embedded
private Name name;
@Embedded
private Address address;
public Integer getMgrId() {
	return mgrId;
}
public void setMgrId(Integer mgrId) {
	this.mgrId = mgrId;
}
public Name getName() {
	return name;
}
public void setName(Name name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Manager(Integer mgrId, Name name, Address address) {
	super();
	this.mgrId = mgrId;
	this.name = name;
	this.address = address;
}
public Manager() {
	super();

}


}


