package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {
public static void main(String[] args) {
	
	   EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("aniket");
	   EntityManager entitymanager= entitymanagerfactory.createEntityManager();
	   EntityTransaction entitytransiction= entitymanager.getTransaction();
	   
	   Pen pen= entitymanager.find(Pen.class,3);
	   if(pen!=null) {
	   entitytransiction.begin();
	   entitymanager.remove(pen);
	   entitytransiction.commit();
	   System.out.println("object with above id deleted");
	   
          } else System.out.println("no such id found");
	   
	   
}
}
