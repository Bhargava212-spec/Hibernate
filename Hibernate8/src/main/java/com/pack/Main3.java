package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main3 {
   public static void main(String[]args) {
	   Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		SQLQuery q = s.createSQLQuery("select * from stud2000");
		List l = q.list();
		Iterator i1 =l.iterator();
	    while(i1.hasNext()) {
	    	Object[] o1 =(Object[])i1.next();
	    	System.out.println(o1[0]+" "+o1[1]+" "+o1[2]+" "+o1[3]);
	    }
	    
	    SQLQuery q1 = s.createSQLQuery("select * from stud2000");
	    q1.addEntity(Student.class);
		List l1 = q1.list();
		Iterator i2 =l1.iterator();
	    while(i2.hasNext()) {
	    	Student s1 =(Student)i2.next();
	    	System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge()+" "+s1.getCity()+"\n");
	    }
	    
   }
}
