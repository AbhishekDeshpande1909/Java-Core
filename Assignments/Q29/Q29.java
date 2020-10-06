import java.util.Scanner;

class Q29
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int iCounter = 0;
		int jCounter = 0;
		
		System.out.print("How many 1D arrays do you want: ");
		int n = sc.nextInt();
		
		int arr2[][] = new int [n][];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("How many elements you want in this 1D array: ");
				int n1 = sc.nextInt();
				arr2[i][n1] = sc.nextInt();
			}
		}System.out.println("Array elements are: ");
		for( int arr[]: arr2)
		{
			for(int a: arr)
			{
				System.out.print(" "+a);
			}
			System.out.println("");
		}

	}
}