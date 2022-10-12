package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_All_Any_NonMatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));	
		
		
		boolean b = students.stream().allMatch(s->s.getMarks()<500);
		
		System.out.println(b);
		
		boolean b1 = students.stream().anyMatch(s->s.getMarks()<500);
		
		System.out.println(b1);
		
		
		int xx = students.stream().collect(Collectors.summingInt(s -> s.getMarks()));
		
		System.out.println(xx);
		
		
		
		
	}

}
