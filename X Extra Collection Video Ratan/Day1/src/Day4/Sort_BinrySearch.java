package Day4;

import java.util.Arrays;

public class Sort_BinrySearch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int arr [] = {5,6,1,0,55,1,23,45,25,7,9,8,66};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int i = Arrays.binarySearch(arr, 1);
		
		
		System.out.println(i);
	}

}
