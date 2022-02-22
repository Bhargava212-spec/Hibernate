package com.pack;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		/*
		 * Student st=new Student(); st.setId(100); st.setName("Bhargava");
		 * st.setAge(22); st.setCity("chennai");
		 * 
		 * s.persist(st);
		 */
		//select multiple//all object
/*		Query q=s.createQuery(" select st from Student st");
		List l=q.list();
		Iterator i=l.iterator();
		while(i.hasNext()) {
		Student s1=(Student)i.next();
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge()+" "+s1.getCity()+"\n");
		}
	    
		
		//2.select specific properties
		Query q1=s.createQuery(" select st.name, st.city from Student st");
		List l1= q1.list();
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			Object[] o=(Object[])i1.next();
			System.out.println(o[0]+" "+o[1]);
		}
		
		
		//3. Select single property 
		Query q2=s.createQuery("select st.age from Student st");
		List l2= q2.list();
		Iterator i2=l2.iterator();
		while(i2.hasNext()) {
		Integer age=(Integer)i2.next();
		System.out.println(age);*/
			
	//	}
		
		//4.select single object
		/*
		 * Query q=s.createQuery("select st from Student st where st.id=103"); Student
		 * s1=(Student)q.uniqueResult();
		 * System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getCity()+" "+s1.getAge
		 * ());
		 */
		//5. select single property for single object
		Query q=s.createQuery("select st.city from Student st where st.id=103");
		String city=(String)q.uniqueResult();
		System.out.println(city);
		
	    t.commit();
	    System.out.println("success");
	    s.close();

	}

}
