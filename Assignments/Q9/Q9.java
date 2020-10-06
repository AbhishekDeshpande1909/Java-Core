import java.util.*;
class Q9
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter days: ");
		int num = sc.nextInt();
		
		int years;
		int months;
		int days;
		
		years = num/365;
		months = num/30;
		days = num/1;
		if(months >= 12)
		{
			months = months - 12*years;
			if( days >= 365 )
			{
				days = days - 365*years;					
			}
		}		
		System.out.println("Years: "+years+" Month/s: "+months+" Days: "+days);		
	
	}
}