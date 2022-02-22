package com.pack;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id:");
		int stuid=Integer.parseInt(sc.nextLine());
		
		//Named parameter - : with any name
		/*
		 * Query q=s.createQuery("select st from Student where id=:abc");
		 * q.setParameter("abc", stuid); Student st =(Student) q.uniqueResult();
		 * System.out.println(st.getName()+" "+st.getAge()+" "+st.getCity());
		 */
		
		//Positional parameter -?0, ?1 etc
		/*
		 * Query q=s.createQuery("select st from Student st  where st.id=:?0");
		 * q.setParameter("0", stuid);
		 * 
		 * Student st=(Student) q.uniqueResult();
		 * System.out.println(st.getName()+" "+st.getAge()+" "+st.getCity());
		 */
		
		/*
		 * Query q=s.
		 * createQuery("update Student st set st.age=:add, st.city=:ct where st.id=:sid"
		 * ); q.setParameter("add", 20); q.setParameter("ct", "Chennai");
		 * q.setParameter("sid", stuid); int result=q.executeUpdate();
		 * System.out.println(result);
		 */
		
		/*
		 * Query
		 * q=s.createQuery("update Student st set st.age=:?, st.city=? where st.id=?");
		 * q.setParameter(0, 20); q.setParameter(1, "Chennai"); q.setParameter(2,
		 * stuid); int result=q.executeUpdate(); System.out.println(result);
		 * 
		 * 
		 *
		 */
		//Pagination
		Query q=s.createQuery("select st from Student st");
		q.setFirstResult(2); //starts from  0 th position
		q.setMaxResults(2);
		List l=q.list();
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Student st=(Student)i.next();
			System.out.println(st.getName()+" "+st.getId());
		}
		
		
		
		 t.commit();
	}

}
