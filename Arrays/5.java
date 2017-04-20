import java.util.Scanner;
class Array2Dimen
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter the rows:-> ");
		int m = s.nextInt();
		System.out.print("Enter columns:-> ");
		int n = s.nextInt();
		System.out.println("\n");
		int a[][] = new int[m][n];
		System.out.println("--------------------------------------");
		for(int i =0; i<m;i++)//row
		{
			System.out.println("\tEnter value in "+(i+1)+" row");
			System.out.println("--------------------------------------");
			for(int j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= ");
				a[i][j] = s.nextInt();
			}
			System.out.println("--------------------------------------");
		}
		System.out.println("\n\t*****************************");
		System.out.println("\tDisplaying Records below:");
		System.out.println("\t*****************************\n");
		for(int i =0; i<m;i++)//row
		{
			for(int j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= "+ a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		

	}
}