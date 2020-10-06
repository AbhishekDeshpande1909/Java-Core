import java.util.Scanner;

class Q23
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//int n = sc.nextInt();

		System.out.print("Enter array elements: ");
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=9;i>=0;i--)
		{
				System.out.println("\n Array elements are (reverse order): "+arr[i]);		

		}
	}
}