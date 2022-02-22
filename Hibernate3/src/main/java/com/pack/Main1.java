package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        
		
		EmployeeDetails empDet=new EmployeeDetails(10,"Ram");
		Employee e=new Employee();
		e.setLocation("Chennai");
		e.setEmpDetails(empDet);
		
		s.persist(e);
		t.commit();
		System.out.println("Data Inserted Successfully");
		s.close();
	}

}
