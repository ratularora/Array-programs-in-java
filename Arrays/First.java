//enter size and its value in array
import java.util.*;
class Arra
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter the size of array :-> ");
		int size = s.nextInt();
		int a[] = new int[size];
		for(int index =0;index<size;index++)
		{
			System.out.print("Enter value "+index +" = ");
			a[index] = s.nextInt();
		}
		for(int index =0;index<size;index++)
		{
			System.out.println("Enter value "+index +" = "+a[index]);
			
		}
	}
}