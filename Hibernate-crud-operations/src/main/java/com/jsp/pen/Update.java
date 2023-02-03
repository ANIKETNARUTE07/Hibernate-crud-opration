package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		 EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("aniket");
		   EntityManager entitymanager= entitymanagerfactory.createEntityManager();
		   EntityTransaction entitytransiction= entitymanager.getTransaction();
		   
		   Pen pen = entitymanager.find(Pen.class, 5);
		   pen.setColor("Red");
		   if(pen!=null) {
			   entitytransiction.begin();
			   entitymanager.merge(pen);
			   entitytransiction.commit();
			   System.out.println("record updated");
		   }else
			   System.out.println("not updated");
	}

}
