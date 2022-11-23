package com.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

    public static void main(String[] args) {
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("xxxY");
        EntityManager em1 = emf1.createEntityManager();

        Address home = new Address("How","WB","7110");
        Address office = new Address("Bnglore","KA","3369");
        Employee employee = new Employee("parimal",100,home,office);


        em1.getTransaction().begin();

        em1.persist(employee);

        em1.getTransaction().commit();

        em1.close();

        System.out.println("Done");
    }
}
