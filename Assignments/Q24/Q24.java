import java.util.Scanner;

class Q24
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter array elements: ");
		int arr[] = new int[10];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter a number to search: ");
		int n = sc.nextInt();
		boolean flag = false;
		int i;
		for(i=0;i<5;i++)
		{
				if( n == arr[i])
				{
					flag = true;
				}

		}
		if(!flag)
		{
					System.out.println("\n Number not found");	
		}				
		else
		{		
			System.out.println("\n Number found");
		}
		
	}
}