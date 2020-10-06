import java.util.Scanner;

class Q22
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//int n = sc.nextInt();

		System.out.print("Enter array elements: ");
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
				for(int j=0;j<arr.length-1;j++)
				{
					if(arr[j] < arr[j+1])
					{
						int temp;
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}	
		}
		System.out.println("\n Sorted array elements are: ");
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
}