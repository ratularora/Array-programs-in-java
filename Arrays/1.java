import java.util.*;
class Array
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		int a[][] = new int[20][20];
		System.out.println("How many rows:-> " );
		int m = s.nextInt();
		System.out.println("How many columns:-> " );
		int n = s.nextInt();
		for(int i = 0; i <m ; i++)
		{
			for(int j = 0; j<n;j++)
			{
				a[i][j]= s.nextInt();
			}
		}
	}
}