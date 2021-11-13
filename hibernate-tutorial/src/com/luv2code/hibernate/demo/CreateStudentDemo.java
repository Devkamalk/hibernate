package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();
		
		try{
			
			//create a student object
			
			System.out.println("Creating new Student");
			
			Student tempStudent = new Student("kamal","kishore","kamal@a.com");
			
			//start a transaction
			session.beginTransaction();
			//save the student object
			
			System.out.println("Saving the Student object");
			
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Saving done congrats");		
			
		}
		
		catch(Exception e){
			factory.close();
		}

	}

}
