package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_Map
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
		
		// Student add 50 grace marks to all student 
		// and get Another List of upgradded students
		
		Stream<Student> str1 = students.stream();
		// ---------------------------------Long way---------------
		Stream<Student> stream1 = str1.map(el->{
			
			Student s2 = new Student(el.getRoll(),el.getName(),el.getMarks()+50);
			return s2;
		});
		
		// -----------------------------Short way--------------------
		Stream<Student> stream2 =	str1.map(el->new Student(el.getRoll(), el.getName(), el.getMarks()+50));
		
		
	    List<Student> modiList = stream2.collect(Collectors.toList());
	    
	    
	    //----------------------------------One Line-----------------
	    List<Student> newList =  students.stream()
	    									.map(s-> new Student(s.getRoll(),s.getName(),s.getMarks()+101))
	    									.collect(Collectors.toList());
	    
	    
	    
	    
//	   --------------------- Qustion 1 ------------
	    
	 // Student add 50 grace marks to those student whose marks under 500
	 // and get Another List of upgradded students
	    
	    
	   List<Student> modiStudents1 = students.stream()
	    .filter(s-> s.getMarks()<500)
	    .map(el->new Student(el.getRoll(), el.getName(), el.getMarks()+50))
	    .collect(Collectors.toList());
	   
	   modiStudents1.forEach(s->System.out.println(s));
	    
	    
	    
	 		
		
		
	    

	}

}
