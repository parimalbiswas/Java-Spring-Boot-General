package Day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStringChar
{
	public static String Duplicate(String original)
	{
		//String resultString = "";
		StringBuilder sb1 = new StringBuilder("");
	    char arr[] = original.toCharArray();
	    
	    Set<Character> set = new LinkedHashSet<>();
	    
	    for (Character elementCharacter : arr)
		{
			set.add(elementCharacter);
		}
	    
	    for (Character elem2 : set)
		{
	    	sb1.append(elem2);
		}
	    
	    System.out.println(set);
	    
	    return sb1.toString();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String result1 = Duplicate("ParimaaP");
		
		System.out.println(result1);

	}

}
