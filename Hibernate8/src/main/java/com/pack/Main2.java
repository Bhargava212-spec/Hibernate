package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Main2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		/*
		 * Criteria cr=s.createCriteria(Student.class); cr.add(Restrictions.lt("age",
		 * 25)); cr.add(Restrictions.le("age", 22)); List l=cr.list(); Iterator
		 * i=l.iterator(); while(i.hasNext()) { Student st=(Student) i.next();
		 * System.out.println(st.getName()+" "+st.getCity()); }
		 */
		
//		  Criteria cr=s.createCriteria(Student.class); Criterion
//		  age=Restrictions.gt("age", 20); Criterion name=Restrictions.like("name",
//		  "B"); LogicalExpression logExp=Restrictions.or(age, name); cr.add(logExp);
//		  cr.addOrder(Order.asc("name")); List l=cr.list(); Iterator i=l.iterator();
//		  while(i.hasNext()) { Student st=(Student) i.next();
//		  System.out.println(st.getName()+" "+st.getCity()); }
//		  
		 
		// HCQL with Projection - used to select single value -rowcount(), min(),max()
		/*
		 * Criteria cr=s.createCriteria(Student.class); //
		 * cr.setProjection(Projections.rowCount());
		 * cr.setProjection(Projections.max("age")); Object o=cr.uniqueResult();
		 * System.out.println(o);
		 */
//		 HCQL with Projection to get single property from entity class
		/*
		 * Criteria cr=s.createCriteria(Student.class);
		 * cr.setProjection(Projections.property("name")); List l=cr.list(); Iterator
		 * i=l.iterator(); while(i.hasNext()); String sname=(String) i.next();
		 * System.out.println(sname);
		 */
		
		//HCQL with Projection to get multiplr property from entity class
		Criteria cr=s.createCriteria(Student.class);
		ProjectionList p=Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("age"));
		cr.setProjection(p);
		List l=cr.list();
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object[] o=(Object[]) i.next();
			System.out.println(o[0]+" "+o[1]);
			
		}
		
		
		
	}
	

}
