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
		int b[][] = new int[m][n];
		System.out.println("--------------------------------------");
		System.out.println("Enter values for A matrix");
		System.out.println("--------------------------------------\n");
		for(int i =0; i<m;i++)//row
		{
			System.out.println("\tEnter value in "+(i+1)+" row");
			for(int j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= ");
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Enter values for b matrix");
		System.out.println("--------------------------------------\n");
		for(int i =0; i<m;i++)//row
		{
			System.out.println("\tEnter value in "+(i+1)+" row");
			for(int j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= ");
				b[i][j] = s.nextInt();
			}
		}
		int c[][] = new int[m][n];
		System.out.println("Displaying after addition\n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print("\ta["+i+"]["+j+"]= " +c[i][j]);
			}
			System.out.println();
		}
	}
}