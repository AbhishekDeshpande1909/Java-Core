import java.util.Scanner;

class Q30
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int arr2[][] = new int [3][3];
		
		for(int i=0;i<arr2.length;i++)
		{
			
				System.out.print("Enter 1D array: ");
				for(int j=0;j<arr2[i].length;j++)
			{
				arr2[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("Diagonal array elements are: ");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i == j)
				{
					sum = sum + arr2[i][j];
					System.out.print(arr2[i][j]+" ");					
				}
				
			}
		}
		System.out.println("\n Sum of diagonal array elements is: "+sum);
		
	}
}