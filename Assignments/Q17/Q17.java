import java.util.Scanner;

class Q17
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int num = n;
		int rev=0;
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		
		
		System.out.println("Reverse of "+num+" is: "+rev);
	}
}