import java.util.*;
class Q7
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;
		double num = n;
		
		System.out.print("Enter the marks of CPP: ");
		int cpp = sc.nextInt();
		System.out.print("Enter the marks of DS: ");
		int ds = sc.nextInt();
		System.out.print("Enter the marks of DB: ");
		int db = sc.nextInt();
		System.out.print("Enter the marks of AWP: ");
		int awp = sc.nextInt();
		System.out.print("Enter the marks of MEAN: ");
		int mean = sc.nextInt();
		int sum = cpp + ds + db + awp + mean;
		
		double per1 = sum/n;
		double per = sum/num;
		System.out.println("\n Sum: "+sum+"\tN: "+n+"\tper: "+per1);		
		
		System.out.println("\n\tPercentage obtained is: "+per);		

	
	}
}