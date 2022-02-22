package com.pack;

import java.util.Date;
import java.util.GregorianCalendar;

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
		
		Student st=new Student();
		/*st.setName("Bhargava");
		st.setAge(20);
		st.setSalary(20000.7846);
		Date d=new Date();
		st.setDob(d);
		st.setGender(Gender.MALE);*/
		
		
	/*	st.setAge(27);
		GregorianCalendar g=new GregorianCalendar(1980,02,03);
		Date date=g.getTime();
		st.setDob(date);
		st.setGender(Gender.MALE);
		st.setSalary(20000.7846);
		s.persist(st);*/
		
		Student st1=(Student)s.get(Student.class,5);
		st1.setName("Virat");
		s.update(st1);
		
		t.commit();
		System.out.println("Student inserted Successfully");
		s.close();
		

	}

}
