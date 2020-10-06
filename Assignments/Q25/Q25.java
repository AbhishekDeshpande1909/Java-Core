import java.util.Scanner;
class Q25
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//int n = sc.nextInt();
		
		int sumOdd = 0;
		int sumEven = 0;
		System.out.print("Enter array elements: ");
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<10;i++)
		{
				if(arr[i]%2 == 0)
				{
				sumEven = sumEven + arr[i];	
				}
				else
				{
					sumOdd = sumOdd + arr[i];	
				}

		}
		System.out.println("\n\tSum of even array elements is: "+sumEven);
		System.out.println("\n\tSum of odd array elements is: "+sumOdd);
	}
}