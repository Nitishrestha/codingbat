package west;

public class Conc
{
public static void main(String[] args)
{
	String result = concat("Nitish","hamal");
	System.out.println(result);
}

private static String concat(String a, String b)
{//abca //dog
	if((a.length() > 0  && b.length() >0) && a.substring(a.length()-2, a.length()).equals(b.substring(0, 2)))
	{
		return a + b.substring(2);
	}
	else return a +b;
}
}