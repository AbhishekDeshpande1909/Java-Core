import java.util.Scanner;

class Q21
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//int n = sc.nextInt();
		
		int sum = 0;
		double avg;
		System.out.print("Enter array elements: ");
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<10;i++)
		{
				sum = sum + arr[i];
				System.out.println("\n Array elements are: "+arr[i]);		

		}
		avg = sum/10.0;
		System.out.println("\n\tSum of array elements is: "+sum);
		System.out.println("\n\tAverage of array elements is: "+avg);
	}
}