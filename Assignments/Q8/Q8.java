import java.util.*;
class Q8
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principle amount: ");
		int Pamt = sc.nextInt();
		
		System.out.print("Enter rate of intrest: ");
		int rate = sc.nextInt();
		
		System.out.print("Enter time period: ");
		int time = sc.nextInt();
		float SI;
		
		SI = (Pamt * rate * time);
		
		System.out.println("\n\tSimple intrest is: "+SI/100);		
	
	}
}