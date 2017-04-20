class Triangle
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1; i<=5; i++)//rows
		{
			for(j=4; j>=i; j--)// spacing
			{
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++)// Display *
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}