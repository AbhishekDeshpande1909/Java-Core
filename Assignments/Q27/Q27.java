import java.util.Scanner;

class Q27
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
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
		for(int i=0;i<=arr.length;i++)
		{
			if(i == 0)
			{
				System.out.println("\n Largest element of array is: "+arr[i]);
			}
			
			if(i == arr.length-1)
			{
				System.out.println("\n Smallest element of array is: "+arr[i]);
			}

		}
	}
}