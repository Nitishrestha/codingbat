package west;

public class MixChar
{
	public static void main(String[] args)
	{
		System.out.println(mixChar("Hi","There"));
	
	}

	private static String mixChar(String str1, String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		String result = "";
		if(len1 >= len2)
		{
			//str1 hellonepali str2 taxi
			//htealxli onepali
			for(int i =0;i< len2;i++)
			{
				result += str1.substring(i, i+1)+ str2.substring(i, i+1);
			}
			result = result + str1.substring(len2);
		
			return result;
		}
		else if(len2 >= len1)
		{
			for(int i=0;i<len1;i++)
			{
				result += str2.substring(i,i+1)+ str1.substring(i,i+1);
			}
			result = result + str2.substring(len1);
			
			return result;
		}
		
		return "" ;
	}
}