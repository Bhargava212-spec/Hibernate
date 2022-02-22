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
		
		CompositeId c=new CompositeId(1,1000);
//		Person p=new Person();
//		p.setName("Bhargava");
//		p.setAddress("Noida");
//		p.setAge(25);
//		p.setPid(c.getPid());
//		p.setPhoneNumber(c.getPhoneNumber());
//		
//		s.persist(p);
	    Person per=(Person)s.load(Person.class, new CompositeId(1,1000));
		System.out.println(per.getAddress());
		
		
		t.commit();
		System.out.println("data inserted successfully");
		s.close();

	}

}
