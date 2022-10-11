package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Demo_Filter
{

	public static void main(String[] args)
	{
		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
		Stream<Student> stream1 = students.stream();
	    Stream<Student> str2 = stream1.filter(s -> s.getMarks() < 500);
	    
		//str2.forEach(e->System.out.println(e));
		
		
		students.stream()
		.filter(e->e.getMarks()>400)
		.forEach(e->System.out.println(e));
		
		
		
		
		

	}

}
