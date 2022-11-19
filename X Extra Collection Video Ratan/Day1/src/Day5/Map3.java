package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<String, Student5> hm5 = new HashMap<>();
		
		hm5.put("Kolkata", new Student5(10,"s1",500));
		hm5.put("Odisha", new Student5(12,"s2",300));
		hm5.put("Delhi", new Student5(15,"n3",800));

		Set<Map.Entry<String, Student5>> set1 = hm5.entrySet();
		
		for (Map.Entry<String, Student5> el1 : set1)
		{
			System.out.println("Student State ->"+el1.getKey());
			System.out.println("------------------");
			
			Student5 student5 = el1.getValue();
			
			System.out.println("Name "+student5.getName());
			System.out.println("Roll "+student5.getRoll());
			System.out.println("Marks "+student5.getMarks());
			System.out.println("===================");
		}
	}

}
