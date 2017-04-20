import java.util.*;
class Searching
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[50];
		int loc=-1;
		int i;
		System.out.print("how many elements u want to enter in an array:-> ");
		int size = s.nextInt();
		for(i = 0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter the element u want to search:-> ");
		int item = s.nextInt();
		for (i=0;i<size;i++)
		{
			if(item == a[i])
			{
				loc = i;
				loc++;
				break;
			}
		}
		if(loc == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element fount at "+loc + " location");
		}
	}
}