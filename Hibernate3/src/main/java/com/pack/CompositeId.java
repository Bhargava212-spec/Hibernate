package com.pack;

import java.io.Serializable;

public class CompositeId implements Serializable{
	private Integer pid;
	private Integer phoneNumber;
	public CompositeId(Integer pid, Integer phoneNumber) {
		super();
		this.pid = pid;
		this.phoneNumber = phoneNumber;
	}
	public CompositeId() {
		super();
		
	}
	public Integer getPid() {
		return pid;
	}
	
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeId other = (CompositeId) obj;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		return true;
	}
	
	
	

}
