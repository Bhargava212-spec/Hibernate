package com.pack;

import java.util.ArrayList;
import java.util.List;

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
		
		Vehicle1 v1=new Vehicle1();
		v1.setName("Car");
		
		Vehicle1 v2=new Vehicle1();
		v1.setName("Bus");
		
		List<Vehicle1> l=new ArrayList<Vehicle1>();
		l.add(v1);
		l.add(v2);
		
		User1 u=new User1();
		u.setName("Bhargava");
		u.setVehicle1(l);
		
		s.persist(u);
		t.commit();
		System.out.println("Data inserted");
		s.close();
		

	}

}
