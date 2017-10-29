package west;

public class BobThere {
	public static void main(String[] args) {
		System.out.println(bobThere("ba"));
	}
	// bobaddsfbobfsdf
	private static boolean bobThere(String string) {
		if (string.length() >= 3)
		{
			for (int i = 0; i < string.length() - 2; i++)
			{
			if (string.substring(i, i + 1).equals("b") && string.substring(i + 2, i + 3).equals("b"))
			{
					return true;
			}
			}
		}
		return false;
	}
}