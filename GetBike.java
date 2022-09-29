package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBike {

	public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        Bike b=entityManager.find(Bike.class, 1);
        System.out.println("------Bike_Info-------");
        System.out.println("Bike Id:"+b.getId());
        System.out.println("Bike Name:"+b.getName());
        System.out.println(("Bike cost:"+b.getCost()));
        
        Charcy c=entityManager.find(Charcy.class, 1);
        System.out.println("------Charcy_Info-----");
        System.out.println("Charcy id:"+c.getId());
        System.out.println("Charcy type:"+c.getType());
        
	}

}
