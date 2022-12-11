package com.parimal.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String cname;
	private Integer fees;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courseslList")
	private Set<Student> studentslist = new HashSet<>();

	public Course()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(cname, fees);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Course other = (Course) obj;
		return Objects.equals(cname, other.cname) && Objects.equals(fees, other.fees);
	}

	public Course(Integer cid, String cname, Integer fees, Set<Student> studentslist)
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
		this.studentslist = studentslist;
	}

	public Integer getCid()
	{
		return cid;
	}

	public void setCid(Integer cid)
	{
		this.cid = cid;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public Integer getFees()
	{
		return fees;
	}

	public void setFees(Integer fees)
	{
		this.fees = fees;
	}

	public Set<Student> getStudentslist()
	{
		return studentslist;
	}

	public void setStudentslist(Set<Student> studentslist)
	{
		this.studentslist = studentslist;
	}

	@Override
	public String toString()
	{
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}

}
