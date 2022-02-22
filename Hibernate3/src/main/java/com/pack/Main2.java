package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {

		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Address addr=new Address("Chennai","Tamilnadu",600119);
		Name name=new Name("Ram","Kumar");
		
		Manager m=new Manager();
		m.setMgrId(10);
		m.setName(name);
		m.setAddress(addr);
		
		s.persist(m);
		t.commit();
		System.out.println("data inserted");
		s.close();
	}

}
