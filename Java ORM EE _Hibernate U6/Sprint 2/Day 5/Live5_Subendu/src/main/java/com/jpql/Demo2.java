package com.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("xxxY");
        EntityManager em1 = emf1.createEntityManager();

        Address2 homwaddress = new Address2("HOW","WB","7110","A");
        Address2 officeddress = new Address2("BLR","KA","3369","B");


        Set<Address2> address2set = new HashSet<>();
        address2set.add(homwaddress);
        address2set.add(officeddress);

        Employee2 employee2 = new Employee2("jjjjj",5555,address2set);

        em1.getTransaction().begin();

        em1.persist(employee2);

        em1.getTransaction().commit();

        em1.close();

        System.out.println("Done");
    }
}
