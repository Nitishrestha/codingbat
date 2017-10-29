package array;

public class Arr
{
	static int[][] myBox = new int[10][10];
	
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				myBox[i][j] = j+1;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(myBox[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
