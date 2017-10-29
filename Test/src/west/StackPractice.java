package west;

import java.util.Stack;

public class StackPractice
{
	public static void main(String[] args)
	{
		Stack<String> myStack = new Stack<>();
		myStack.push("H");
		myStack.push("E");
		myStack.push("L");
		myStack.push("L");
		myStack.push("O");
		
		int i = 0;
	while(i< 5)
	{
		System.out.print(myStack.pop());
		i++;
	}
}
}
