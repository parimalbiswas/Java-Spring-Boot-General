package Day4;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSt2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SortByMarks sbm1 = new SortByMarks();
		TreeSet<Student1> set = new TreeSet<>(sbm1);
		
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
		
		System.out.println("-------------");
		Student1 smax1 = Collections.max(set,sbm1);
		
		System.out.println(smax1);
		
		System.out.println("-----------------");
		
		

	}

}
