package west;

public class RepeatEnd
{
	public static void main(String[] args)
	{
		System.out.println(repeatEnd("Hello",3));
		
	}

	//hello 3
	private static String repeatEnd(String string, int i) {
		String result ="";
		for(int j = 0;j < i;j++)
		{
			result+= string.substring(string.length()-i); 
		}
		return result ; 
		
	}
}
