import java.util.*;
class Q10
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temp: ");
		float f = sc.nextInt();
		float c = 5*(f-32)/9;
		
		System.out.printf("\n\tConverted temp is: %.2f",c);		

	
	}
}