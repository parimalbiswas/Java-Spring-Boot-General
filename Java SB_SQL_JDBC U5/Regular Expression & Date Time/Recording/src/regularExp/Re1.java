package regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re1
{
	public static void main(String[] args)
	{
		int count = 0;
		Pattern pattern = Pattern.compile("ab");

		Matcher matcher = pattern.matcher("anflabraba");

		while (matcher.find())
		{
			count++;
			System.out.println(matcher.start() + "--" + matcher.end() + "--" + matcher.group());
		}

		System.out.println("no of occourance " + count);

	}
}
