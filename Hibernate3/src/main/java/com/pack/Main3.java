package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main3 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();

		
		Player p=new Player();
		p.setName("Ramesh");
		p.setNoOfMatches(10);
		
		s.persist(p);
		t.commit();
		s.close();
		
		Session s1=sf.openSession();
		Transaction t1=s1.beginTransaction();
		
		p.setNoOfMatches(100);
		s1.merge(p);  //used to update persistent entity instance
		t1.commit();
		s1.close();
	}

}
