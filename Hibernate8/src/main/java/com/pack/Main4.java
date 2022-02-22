package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main4 {

	public static void main(String[] args) {
        
		  Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			/*
			 * Query q=s.getNamedQuery("findStudent"); List l=q.list(); Iterator
			 * i=l.iterator(); while(i.hasNext()) { Student st=(Student) i.next();
			 * System.out.println(st.getName()+" "+st.getCity()+" "+st.getId()); }
			 */
			/*
			 * Query q=s.getNamedQuery("findStudentByName"); q.setParameter("stuid", 100);
			 * String str=(String)q.uniqueResult(); System.out.println();
			 */
			
			/*
			 * Query q=s.getNamedQuery("findAllStudent"); List l=q.list(); Iterator
			 * i=l.iterator(); while(i.hasNext()) { Student st=(Student) i.next();
			 * System.out.println(st.getName()+" "+st.getCity()+" "+st.getId()); }
			 */
			Query q=s.getNamedQuery("findById");
			q.setParameter(0, 100);
			Student st=(Student) q.uniqueResult();
			System.out.println(st.getName()+" "+st.getAge()+" "+st.getCity());
			
	}

}
