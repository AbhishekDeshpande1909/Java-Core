import java.util.Scanner;

class Q28
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array elements: ");
		int n = sc.nextInt();
		System.out.print("Enter array elements: ");
		
			sc.nextLine();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextLine();
		}System.out.println("Array elements are: ");
		for( String a : arr)
		{
			System.out.println(a);
		}

	}
}