package com.pack;

import java.util.ArrayList;
import java.util.List;

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
		
		User2 u1=new User2();
		u1.setName("Bhargava");
		
		User2 u2=new User2();
		u2.setName("Balaji");
		
		Vehicle2 v1=new Vehicle2();
		v1.setName("Benz");
		
		Vehicle2 v2=new Vehicle2();
		v2.setName("Audi");
		
		List<Vehicle2> l1=new ArrayList<Vehicle2>();
		l1.add(v1);
		l1.add(v2);

		List<User2> l2=new ArrayList<User2>();
		l2.add(u1);
		l2.add(u2);
		
		u1.setVehicle(l1);
		u2.setVehicle(l1);
		v1.setUser(l2);
		v2.setUser(l2);
		
		s.persist(u1);
		s.persist(u2);
		s.persist(v1);
		s.persist(v2);
		
		t.commit();
		System.out.println("Data inserted successfully");
		s.close();

	}

}
