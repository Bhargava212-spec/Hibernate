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
        
		Employee1 e1=new Employee1();
		e1.setId(103);
		e1.setName("Bhargava");
		
		RegularEmployee1 r=new RegularEmployee1();
		r.setId(104);
		r.setName("Balaji");
		r.setSalary(20000.0);
		r.setBonus(500);
		
		ContractEmployee1 c=new ContractEmployee1();
		c.setId(105);
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
