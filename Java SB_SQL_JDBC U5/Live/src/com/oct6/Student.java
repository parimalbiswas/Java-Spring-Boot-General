package com.oct6;

import java.util.Objects;

public class Student
{
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(marks, name, roll);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
