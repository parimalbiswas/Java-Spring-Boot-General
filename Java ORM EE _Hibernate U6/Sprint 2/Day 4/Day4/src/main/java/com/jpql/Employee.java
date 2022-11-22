package com.jpql;

import javax.persistence.*;

@Entity
//@Table(name = "table-name")
@NamedQuery(query = "select e from Employee e where e.eid = :id and e.ename = :name", name ="alieas1" )
@NamedNativeQuery(query = "Select * from Employee e where e.ename =  :name", resultClass = Employee.class, name = "getPersonByName")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int eid;
    private  String ename;
    private  double salary;
    private  String deg;

    public Employee(int eid, String ename, double salary, String deg) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee(String ename, double salary, String deg) {
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }
}
