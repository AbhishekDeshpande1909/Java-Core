import java.util.*;
class Q11
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1: ");
		int a = sc.nextInt();
		System.out.println("Enter No2: ");
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("No 1 after swapped: "+a);
		System.out.println("No 2 after swapped: "+b);		

	
	}
}