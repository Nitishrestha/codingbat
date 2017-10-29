package west;

public class EndOther
{
	public static void main(String[] args)
	{
		System.out.println(endOther("helloWORLD", "WORld"));
	}
	private static boolean endOther(String str1, String str2)
	{
	int len1 = str1.length();
	int len2= str2.length(); 
	if(len2 >= len1 && str2.toLowerCase().substring(len2-len1).equalsIgnoreCase(str1))
	{
		return true;
	}
	else if(len1 >= len2 && str1.toLowerCase().substring(len1-len2).equalsIgnoreCase(str2))
	{
		return true;
	}
		return false;
	}
}
