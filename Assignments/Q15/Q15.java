import java.util.*;
class Q15
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender: ");
		char gender = sc.next().charAt(0);
		if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
		{
			System.out.println("Enter the age: ");
			int age = sc.nextInt();		
			if((gender == 'M' || gender == 'm') && age < 21)
			{
				System.out.println(" You are not allowed to get married this soon");					
			}
			else if((gender == 'F' || gender == 'f') && age < 18)
			{
				System.out.println(" You are not allowed to get married this soon");
			}
			else
			{
				System.out.println(" You are allowed to get married ");			
			}			
		}
		else
		{
			System.out.println(" Gender must be either m / M /f / F");	
		}

	
	}
}