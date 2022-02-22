package com.pack;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class EmployeeDetails implements Serializable {
         private Integer id;
         private String name;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public EmployeeDetails(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public EmployeeDetails() {
			super();
			
		}
         
}
