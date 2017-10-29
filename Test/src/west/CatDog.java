package west;

public class CatDog
{
	public static void main(String[] args)
	{
		System.out.println(catDog("dogcatdogcatcatcatdogdog"));	
	}
	//hellocat(8)
	private static boolean catDog(String string) {
		int cat = 0;
		int dog = 0;
		
		for(int i =0;i < string.length()-2;i++)
		{
			if(string.substring(i,i+3).equals("cat"))
			{
				System.out.println(".........");
				cat++;
			}
			else if(string.substring(i,i+3).equals("dog"))
			{
				dog++;
			}
		}
		System.out.println("Number of cat :"+cat);
		System.out.println("Number of dog :"+dog);
		
		if(cat == dog)
		{
			return true;
		}
		return false;

	}
}
