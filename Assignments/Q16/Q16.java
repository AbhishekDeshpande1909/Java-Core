import java.util.Scanner;

class Q16
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("Table for "+n+" is: ");
		for(int i=1;i<11;i++)
		{
			int table = n*i;
			System.out.println(table);
		}
	}
}