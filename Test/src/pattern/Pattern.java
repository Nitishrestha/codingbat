package pattern;

public class Pattern 
{
	public static void main(String[] args)
	{
		
		String result = concat("abaca", "cat");
		System.out.println(result);
	}
	public static String concat(String a, String b)
	{
		if((a.length()>0 && b.length()>0) && a.substring(a.length()-1).equals(b.substring(0,1)))
		{
			return a + b.substring(1, b.length());
		}
		else return a+b;
	}
}
