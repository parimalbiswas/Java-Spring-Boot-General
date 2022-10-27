package Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map2
{

	public static void main(String[] args)
	{
		HashMap<String, Student5> hm5 = new HashMap<>();
		
		hm5.put("Kolkata", new Student5(10,"s1",500));
		hm5.put("Odisha", new Student5(12,"s2",600));
		hm5.put("Delhi", new Student5(15,"n3",800));
		
		

		System.out.println("----------");
		
		Set<String> citySet = hm5.keySet();
		System.out.println(citySet);
		
		for (String elemString : citySet)
		{
			System.out.println(elemString);
		}
		
		System.out.println("---------------------------");
		System.out.println("--Map to ArryLiist Long Way--------");
		
		Set<Map.Entry<String, Student5>> es1 = hm5.entrySet();
		
		List<Student5> list = new ArrayList<>();
		
		for (Map.Entry<String, Student5> elem111 : es1)
		{
			list.add(elem111.getValue());
		}
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		System.out.println("-------Map to Arrylist Way 2---------");
		
		Collection<Student5> colltn1 = hm5.values();
		ArrayList<Student5> arrayList = new ArrayList<>(colltn1);
		System.out.println(arrayList);
		
		System.out.println("---------------------------------");
		System.out.println("--------Print all student-----------");
		
		for (Student5 elemStudent5 : arrayList)
		{
			System.out.println("Name "+elemStudent5.getName());
			System.out.println("Roll "+elemStudent5.getRoll());
			System.out.println("Marks "+elemStudent5.getMarks());
			System.out.println("************");
		}
	}

}
