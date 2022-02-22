package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        
		Employee e1=new Employee();
		e1.setName("Bhargava");
		
		RegularEmployee r=new RegularEmployee();
		r.setName("Balaji");
		r.setSalary(20000.0);
		r.setBonus(500);
		
		ContractEmployee c=new ContractEmployee();
		c.setName("Remo");
		c.setPay_per_hour(400);
		c.setDuration(5);
		
		s.persist(e1);
		s.persist(r);
		s.persist(c);
		
		t.commit();
		System.out.println("Inserted Successfully");
		s.close();
		

	}

}
