package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		add();
		
	}
	
	//add student
	static void add() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Student s = new Student();
		
		s.setFname("hari");
		s.setLname("lama");
		s.setAge(30);
		s.setCollage("Ncc");
		
		
		sess.save(s);//insert sql
		sess.getTransaction().commit();//execute sql
		sess.close();//close db
		
		
		
		
	}

}
