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
		
		Vehicle v=new Vehicle();
		v.setName("Car");
		
		User u=new User();
		u.setName("Raju");
		u.setVehicle(v);
		
		s.persist(u);
		t.commit();
		System.out.println("Data inserted");
		s.close();

	}

}
