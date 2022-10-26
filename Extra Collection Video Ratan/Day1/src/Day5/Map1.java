package Day5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1
{

	public static void main(String[] args)
	{
		Map<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");
		hm1.put(4, "four");
		
		System.out.println(hm1);
		
		System.out.println("----Get Keys------");
		
		Set<Integer> keySet = hm1.keySet();
		
		System.out.println(keySet);
		for (Integer integer : keySet)
		{
			System.out.println(integer);
		}
		
		
		System.out.println("----Get Values------");
		
		Collection<String> values1 = hm1.values();
		System.out.println(values1);
		for (String string : values1)
		{
			System.out.println(string);
		}
		
		
		System.out.println("----Get Key Values Both------");
		
		0.38

	}

}
