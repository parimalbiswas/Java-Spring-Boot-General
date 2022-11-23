package com.jpql;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int did;
    private  String ename;
    private int salary;
    @Embedded
    @ElementCollection
    @JoinTable(name = "address", joinColumns = @JoinColumn(name = "empId"))
    private Set<Address2> addlist = new HashSet<Address2>();

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Address2> getAddlist() {
        return addlist;
    }

    public void setAddlist(Set<Address2> addlist) {
        this.addlist = addlist;
    }


    @Override
    public String toString() {
        return "Employee2{" +
                "did=" + did +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", addlist=" + addlist +
                '}';
    }

    public Employee2(String ename, int salary, Set<Address2> addlist) {
        this.ename = ename;
        this.salary = salary;
        this.addlist = addlist;
    }

    public Employee2() {
    }
}
