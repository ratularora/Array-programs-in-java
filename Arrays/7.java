import java.util.Scanner;
class Multiplication
{
	public static void main(String ar[])
	{
		int i,j,k;
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter the rows for a:-> ");
		int m = s.nextInt();
		System.out.print("Enter columns for a :-> ");
		int n = s.nextInt();
		System.out.println("\n");
		System.out.print("\nEnter the rows for b:-> ");
		int p = s.nextInt();
		System.out.print("Enter columns for b:-> ");
		int q = s.nextInt();
		
		int a[][] = new int[m][n];
		int b[][] = new int[p][q];
		int multiply[][] = new int[m][q];
		System.out.println("--------------------------------------");
		System.out.println("Enter values for A matrix");
		System.out.println("--------------------------------------\n");
		for(i =0; i<m;i++)//row
		{
			System.out.println("\tEnter value in "+(i+1)+" row");
			for( j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= ");
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Enter values for b matrix");
		System.out.println("--------------------------------------\n");
		for(i =0; i<m;i++)//row
		{
			System.out.println("\tEnter value in "+(i+1)+" row");
			for(j = 0;j<n;j++)//columns
			{
				System.out.print("\ta["+i+"]["+j+"]= ");
				b[i][j] = s.nextInt();
			}
		}
		if(n!=p)
		{
			System.out.println("Matrix multiplication is not possible");
		}
		else
		{
			for ( i = 0 ; i < m ; i++ )
			{
				for ( j = 0 ; j < q ; j++ )
				{   
				   for ( k = 0 ; k < p ; k++ )
				   {
					  sum = sum + a[i][k]*b[k][j];
				   }

				   multiply[i][j] = sum;
				   System.out.print("\ta["+i+"]["+j+"]= " +multiply[i][j]);
				   sum = 0;
				}
			}
        }
	}
}