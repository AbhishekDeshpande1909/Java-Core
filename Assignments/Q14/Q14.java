import java.util.*;
class Q14
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int yr = sc.nextInt();
		
		if(yr%4 == 0)
		{
			if( yr%100 == 0 && yr%400 != 0)
			{
			System.out.println(yr+" is not the leap year");					
			}
			else
			{
				System.out.println(yr+" is the leap year");
			}
		}
		else
		{
			System.out.println(yr+" is not the leap year");
		}
	
	}
}