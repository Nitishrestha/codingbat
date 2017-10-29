package west;

public class BalanceXY
{
	public static void main(String[] args)
	{
		System.out.println(xyBalance("xxxxxxxxxxxxxxxxyy"));

	}
//xy
	private static boolean xyBalance(String string)
	{
		for(int i=0;i<string.length()-1;i++)
		{
			if(string.substring(i,i+1).equals("x"))
			{
				if(string.substring(i+1,i+2).equals("y"))
				{
					System.out.println("hello");
					return true;	
				}
			}
		}
		return false;
	}
}
