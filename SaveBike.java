package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBike {

	public static void main(String[] args) {
       Bike b=new Bike();
       b.setName("Honda");
       b.setCost(50000);
       
       Charcy charcy =new Charcy();
       charcy.setType("xyz");
       
       b.setCharcy(charcy);
     //  charcy.setBike(b);
       
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       et.begin();
       em.persist(b);
       em.persist(charcy);
       et.commit();
	}

}
