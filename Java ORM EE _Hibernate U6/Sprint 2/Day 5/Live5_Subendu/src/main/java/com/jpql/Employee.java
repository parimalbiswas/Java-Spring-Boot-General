package com.jpql;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int did;
    private  String ename;
    private int salary;
    @Embedded
    @AttributeOverrides({
           @AttributeOverride(name = "state", column = @Column(name = "homeState")),
            @AttributeOverride(name = "city", column = @Column(name = "homeCity")),
            @AttributeOverride(name = "pincode", column = @Column(name = "homePincode"))
    })
    private  Address homeAddress;


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "state", column = @Column(name = "officeState")),
            @AttributeOverride(name = "city", column = @Column(name = "officeCity")),
            @AttributeOverride(name = "pincode", column = @Column(name = "officePincode"))
    })
    private  Address OfficeAddress;

    public Employee(String ename, int salary, Address homeAddress, Address officeAddress) {
        this.ename = ename;
        this.salary = salary;
        this.homeAddress = homeAddress;
        OfficeAddress = officeAddress;
    }

    public Employee() {
    }

    public Employee(String ename, int salary, Address homeAddress) {
        this.ename = ename;
        this.salary = salary;
        this.homeAddress = homeAddress;
    }

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

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        OfficeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "did=" + did +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", homeAddress=" + homeAddress +
                ", OfficeAddress=" + OfficeAddress +
                '}';
    }
}
