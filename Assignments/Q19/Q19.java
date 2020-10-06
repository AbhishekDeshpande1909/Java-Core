import java.util.Scanner;
import java.lang.Math; 

class Q19
{
	static double powAdd;
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		double pow;
		System.out.println("Series: ");
		for(int i=1;i<=n;i++)
		{
			 pow = Math.pow(i, 2);
			 powAdd = powAdd + pow;
			System.out.println(" "+pow);
			

		}
				System.out.println("\n Addition of series is: "+powAdd);
	}
}