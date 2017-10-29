package west;

public class CountCode
{
	public static void main(String[] args) {
		System.out.println("Hello "+countCode("codeabccode"));
	}
	
	private static int countCode(String string)
	{
		int code = 0;
		for(int i = 0;i < string.length()-3;i++)
		{
			//codeabccode total length = 11 
			if(string.substring(i,i+2).equals("co") && string.substring(i+3,i+4).equals("e"))
			{
				code++;
			}
		}
		if(code > 0)
		{
			return code;
		}
		return 0;
	}
}