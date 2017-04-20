import java.util.*;
class cmp
{
	public static void main(String ar[])
	{
		int temp;
		Scanner s = new Scanner(System.in);
		int a[] = new int [5];
		int size = 5;
		int h[] = new int [5];
		for(int i =0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("jjjjjj");
		for(int j =0;j<a.length;j++)
	
		{
			h[j] = s.nextInt();
		}
		
		
		for(int i= 0;i<a.length;i++)
		{
		if(a[i] == h[i])
		{
		System.out.println("both are eual");
		}
		else
		{
		System.out.println("both are  not eual");
		}
		}
		}
		}