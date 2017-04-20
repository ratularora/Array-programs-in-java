import java.util.*;
class Array2
{
	public static void main(String[] ar)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter the size of array :-> ");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("\nEnter the elements of array:-> ");
		System.out.println("\n\t==============================\n");
		for(int index = 0; index < a.length; index++)
		{
			System.out.print("\t\ta[" + index + "]=" );
			a[index] = s.nextInt();
		}
		System.out.println("\n\t==============================");
		System.out.println("\nDisplaying Values");
		System.out.println("\t==============================");
		for(int index = 0;index < size; index++)
		{
			System.out.println("\t\ta["+ index + "]= "+ a[index]);
		}
		System.out.println("\n\t==============================");
	}
}