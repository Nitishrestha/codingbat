package west;

public class CountHi
{
	public static void main(String[] args)
	{
		System.out.println(countHi("hellohi"));
	}

	private static int countHi(String string)
	{
		int count = 0;
		for(int i =0; i < string.length()-1;i++)
		{
			//length = 7 i can go upto 5
			if(string.substring(i,i+2).equals("hi"))
			{
				count++;
			}
		}

		return count;
	}

}
