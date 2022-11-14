package regularExp;

import java.util.regex.Pattern;

public class Rg10
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
		// System.out.println(Pattern.matches("[amn]", "abcd"));
	}
}
