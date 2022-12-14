package com.parimal.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;

	@Embedded
	private Address address; // has-A

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courseslList = new HashSet<>();

	public Student()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(address, marks, name);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(marks, other.marks)
				&& Objects.equals(name, other.name);
	}

	public Student(Integer roll, String name, Integer marks, Address address, Set<Course> courseslList)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.courseslList = courseslList;
	}

	public Integer getRoll()
	{
		return roll;
	}

	public void setRoll(Integer roll)
	{
		this.roll = roll;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getMarks()
	{
		return marks;
	}

	public void setMarks(Integer marks)
	{
		this.marks = marks;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public Set<Course> getCourseslList()
	{
		return courseslList;
	}

	public void setCourseslList(Set<Course> courseslList)
	{
		this.courseslList = courseslList;
	}

	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}

}
