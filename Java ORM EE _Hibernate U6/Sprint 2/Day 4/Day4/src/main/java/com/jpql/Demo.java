package com.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("emp");
        EntityManager em1 = emf1.createEntityManager();


        Query query = em1.createNamedQuery("getPersonByName");
        query.setParameter("name","hhhh");

        List<Employee> liste = query.getResultList();

        for (Employee e : liste) {
            System.out.println(e);
        }



//        Query query = em1.createNativeQuery("Select * from Employee",Employee.class);
//
//        List<Employee> employeeslist = query.getResultList();
//
//        for (Employee e : employeeslist) {
//            System.out.println(e);
//        }









//        Query query = em1.createNamedQuery("alieas1");
//        query.setParameter("id",2);
//        query.setParameter("name","hhhh");
//
//        List<Employee>  list4 = query.getResultList();
//
//        for (Employee e : list4) {
//            System.out.println(e);
//        }










//        Query query = em1.createQuery("select UPPER(e.ename) from Employee e");


//        List<String> list = query.getResultList();
//
//        for (String s : list)
//        {
//            System.out.println("Employee name : "+s);
//        }
//
//        Query query1 = em1.createQuery("select MAX(e.salary) from Employee e");
//
//        Double result  = (Double) query1.getSingleResult();
//
//        System.out.println("Max Emp Salary : "+result);
//
//
//        Query query2 = em1.createQuery("select e from Employee e where e.salary Between 5000 and 9000");
//
//        List<Employee> list2 = (List<Employee>) query2.getResultList();
//
//        for (Employee e : list2) {
//            System.out.println(e);
//        }
//
//
//        Employee employee = new Employee("Subendu",10000,"HR");
//
//        em1.getTransaction().begin();
//
//        em1.persist(employee);
//
//        em1.getTransaction().commit();
//
//        em1.close();



    }

}
