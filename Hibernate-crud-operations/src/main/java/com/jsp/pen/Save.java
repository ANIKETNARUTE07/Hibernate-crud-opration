package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aniket");
	   EntityManager entityManager=entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction=entityManager.getTransaction();
	   
	   Pen p= new Pen();
//	   p.setId(1);
	   p.setBrand("cello");
	   p.setColor("blue");
	   p.setPrice(15);
	   
	   entityTransaction.begin();
	   entityManager.persist(p);
	   entityTransaction.commit();
	   System.out.println("record inserted");
	   
	   
	   
}
}
