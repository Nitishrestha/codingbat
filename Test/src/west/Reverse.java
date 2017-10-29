package west;

public class Reverse
{
	public static void main(String[] args) {
	
		String s = "Chocolate";
		String result = "";
		
		for(int i =4; i>=0; i--)
		{
			result += s.substring(0, i);
		}
		System.out.println(result);
	}
}
