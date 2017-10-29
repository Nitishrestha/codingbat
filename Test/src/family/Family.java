package family;

import java.util.Scanner;

public class Family
{
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("Enter father's name");
		Scanner scanner = new Scanner(System.in);
		String fName = scanner.nextLine();
		String[] fLastName = fName.split(" ");
		System.out.println("Enter mother's name");
		String mName = scanner.nextLine();
		String[] mLastName = mName.split(" ",2);
		String child = fName.substring(0,3)+ mName.substring(3,mLastName[0].length());
		System.out.println(fLastName[0]);
		System.out.println(fLastName[1]);
		System.out.println(mLastName[0]);
		System.out.println(mLastName[1]);
		
		System.out.println("Child's name could be "+child+" "+mLastName[1]+" "+fLastName[1]);
		System.out.println("Do you want to continue?(N/Y)");
		if(scanner.next().equalsIgnoreCase("n"))
		{
			System.out.println("Thank you, pleas visit again :)");
			System.exit(0);
		}
		else
			continue;
	}
	
	}
}
