package west;

public class RepeatFront
{
	public static void main(String[] args)
	{
		System.out.println(repeatFront("Ice Cream",2));
	}

	//chocolate 4 chocchochc
	private static String repeatFront(String string, int num) {
		String result= "";
		for(int i=num; i >= 0;i--)
		{
			result += string.substring(0,i);
		}
		return result;
		
	}

}
