package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3
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
		
		
		// Kids Programming
		Stream<Student> stream = students.stream();
		Stream<Student> filterStream = stream.filter(e-> e.getMarks()<500);
		List<Student> filterList =  filterStream.collect(Collectors.toList());
		
		
		//in One Line
		List<Student> fiList = students.stream()
		.filter(e-> e.getMarks()<500)
		.collect(Collectors.toList());
		
		
		fiList.forEach(e->System.out.println(e));
		
	}

}
