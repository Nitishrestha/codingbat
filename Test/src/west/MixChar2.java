package west;

public class MixChar2 {
	public static void main(String[] args) {
		System.out.println(mixcChar("abcdefgh", "1234567890"));
	}

	private static String mixcChar(String str1, String str2) {
		if (str1.length() >= 0 && str2.length() >= 0) {
			String result = "";
			if(str1.length() == 0)
			{
				return str2;
			}
			else if(str2.length() == 0)
			{
				return str1;
			}
			int len1 = str1.length();
			int len2 = str2.length();
			if (len1 >= len2) {
				for (int i = 0; i < len2; i++) {
					result += str1.substring(i, i + 1) + str2.substring(i, i + 1);
				}
				result = result + str1.substring(len2);

				return result;
			} else if (len2 >= len1) {
				// hi there
				for (int i = 0; i < len1; i++) {
					result += str1.substring(i, i + 1) + str2.substring(i, i + 1);
				}
				result = result + str2.substring(len1);
				return result;
			}

		}
		return "";

	}
}