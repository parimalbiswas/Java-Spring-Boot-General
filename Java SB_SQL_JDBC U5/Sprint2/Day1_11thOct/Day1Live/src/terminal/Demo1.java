
/*
 * -----------------Terminal Methods----------------
 * forEach()
 * collect
 * min
 * max
 * count
 * get
 * anyMatch
 * AllMatch
 * 
 * 
 * -----------------Intermidiate Methods----------------
 * map()
 * filter
 * 
 * 
 * 
 * 
 * */


package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("one","two","three");
		
		Stream<String> s1 = list.stream(); //Terminal Methods
		
		s1.forEach(s->System.out.println(s.toUpperCase()));
		
		
		
	}

}


 