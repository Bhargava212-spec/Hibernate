package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {
   public static void main (String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee1 e1=new Employee1();
		e1.setName("Bhargava");
		
		RegularEmployee1 r1=new RegularEmployee1();
		r1.setName("Balaji");
		r1.setBonus(5000);
		r1.setSalary(3000);
		
		ContractEmployee1 c1=new ContractEmployee1();
		c1.setName("Remo");
		c1.setPay_per_hour(500);
		c1.setDuration(3);
		
		s.persist(e1);
		s.persist(r1);
		s.persist(c1);
		t.commit();
		System.out.println("Inserted successfully");
		s.close();
   }
}
