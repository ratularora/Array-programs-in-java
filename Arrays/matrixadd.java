import java.util.*;
class MethosEg
{
	  static int a[][];
	 static int b[][];
	
	static Scanner s = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter row:->");
		int m = s.nextInt();
		System.out.print("Enter columns:->");
		int n = s.nextInt();
		//a = new int[m][n];
		System.out.print("Enter row:->");
		int x = s.nextInt();
		System.out.print("Enter columns:->");
		int y = s.nextInt();
		a = new int[m][n];
		b = new int[x][y];
		
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter element at --"+i+j+"=");
				a[i][j]=s.nextInt();
			}
		}
		for(int i =0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print("Enter element at --"+i+j+"=");
				b[i][j]=s.nextInt();
			}
		}
		int c[][] = new int[20][20];
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+ "\t");
			
				}
				System.out.println("");
			
			
		}


	}
}