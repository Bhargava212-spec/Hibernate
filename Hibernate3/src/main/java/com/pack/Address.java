package com.pack;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
   private String city;
   private String state;
   private Integer zipcode;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Integer getZipcode() {
	return zipcode;
}
public void setZipcode(Integer zipcode) {
	this.zipcode = zipcode;
}
public Address(String city, String state, Integer zipcode) {
	super();
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public Address() {
	super();
	
}
   
}
