import java.util.*;
class Sort
{
	public static void main(String ar[])
	{
		int temp;
		Scanner s = new Scanner(System.in);
		int a[] = new int [5];
		int size = 5;
		for(int i =0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Displaying");
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-1);j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i =0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}