package com.pack;

 

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class Main {

 

    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
		/*
		 * Transaction t=s.beginTransaction(); Employee e=new Employee();
		 */
       /* e.setEmpId(1000);
        e.setName("Ram");
        e.setSalary(20000.0);
        e.setAddress("chennai");
        e.setQualification("BE");
        
        s.persist(e); */
        
       /* e.setEmpId(1003);
        e.setName("ramu");
        e.setSalary(40000.0);
        e.setAddress("Noida");
        e.setQualification("MBBS");
        
        System.out.println(s.save(e));*/
        
        /* Employee emp=(Employee) s.get(Employee.class, 101);
       emp.setSalary(50000.0);
       emp.setAddress("Delhi");
       s.update(emp);*/
        
        
//     Employee emp=(Employee) s.load(Employee.class, 1003);
//     s.delete(emp); 
//        
//     	Query q1=s.getNamedQuery("findByName");
//		q1.setParameter(0,100);
//		Object[] o=(Object[])q1.uniqueResult();
//		System.out.println(o[0]);
		
		
		  SQLQuery q2=s.getNamedSQLQuery("findByName");
		  q2.addEntity(Employee.class);
		  q2.setParameter(0,100); 
		  Employee emp=(Employee)q2.uniqueResult();
		  System.out.println(emp.getName());
		 
			/*
			 * t.commit(); System.out.println("Data inserted successfully"); s.close();
			 */
 

    }

 

}
 