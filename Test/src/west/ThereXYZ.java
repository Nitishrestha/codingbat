package west;

public class ThereXYZ
{
	public static void main(String[] args)
	{

		System.out.println(thereXYZ("xyz.abc"));
	}

	private static boolean thereXYZ(String string)
	{
		if(string.contains("xyz"))
		{
			if(string.indexOf("xyz") == 0)
			{
				return true;
			}
			else if(string.charAt(string.indexOf("xyz")-1) != '.')
			{
				return true;
			}	
		}
		return false;
	}
}
