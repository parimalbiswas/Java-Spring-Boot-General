package Day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicateHatao
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(50);
		al.add(89);
		al.add(55);
		al.add(89);
		
		System.out.println(al);
		
		System.out.println("-----------------------");
		
		Set<Integer> set = new LinkedHashSet<>(al);
		
		System.out.println(set);
		
		
		
		
		
		

	}

}
