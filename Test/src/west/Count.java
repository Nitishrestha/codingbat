package west;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Count
{
	public static void main(String[] args)
	{
		System.out.println("Enter a sentence");
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split(" ");
		display(words);
		scanner.close();

	}
	
	public static void display(String[] sentence)
	{
		List<String> wordList = new ArrayList<>();
		for(String s : sentence)
		{
			wordList.add(s);
		}
		Map<String,Integer> wordMap = new HashMap<>();
		
		for(String ss : wordList)
		{
			if(!wordMap.containsKey(ss))
			{
				wordMap.put(ss, 1);
			}
			else
			{
				wordMap.put(ss, wordMap.get(ss)+1);
			}
		}
	
		System.out.println(wordMap);
	}
}