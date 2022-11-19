package Day4;

import java.util.TreeSet;

public class TreeSt1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(50);
		set1.add(59);
		set1.add(23);
		set1.add(59);
		
		System.out.println(set1);
		
		
		TreeSet<Student1> set = new TreeSet<>();
		
		set.add(new Student1(5,"n1",500));
		set.add(new Student1(78,"n3",300));
		set.add(new Student1(56,"n2",900));
		set.add(new Student1(78,"n3",300));
		set.add(new Student1(12,"n4",100));
		set.add(new Student1(56,"n2",900));
		
		//System.out.println(set);
		for (Student1 student1 : set)
		{
			System.out.println(student1);
		}
		

	}

}
