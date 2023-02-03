package com.jsp.pen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		String sql= "Select p from Pen p";
		// Query is an interface present in persistance package 
		Query query= entityManager.createQuery(sql);
		List<Pen> pen= query.getResultList();
		
		for(Pen p : pen) {
			
			System.out.println("==================");
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getColor());
			System.out.println(p.getPrice());
		}
		
        
	}

}
