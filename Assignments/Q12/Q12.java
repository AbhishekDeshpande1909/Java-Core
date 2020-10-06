import java.util.*;
class Q12
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int sal = sc.nextInt();
		
		double hra;
		double DA;
		double GS;
		
		if(sal < 10000)
		{
			hra = (sal*10)/100;
			System.out.println(hra);
			DA = (sal*90)/100;
			System.out.println(DA);
			
			GS = sal+DA+hra;
			System.out.println("GS is: "+GS);
		}
		
		if(sal >= 10000)
		{
			hra = 2000;
			System.out.println(hra);
			DA = (sal*98)/100;
			System.out.println(DA);
			
			GS = sal+DA+hra;
			System.out.println("GS is: "+GS);
		}
	}
}