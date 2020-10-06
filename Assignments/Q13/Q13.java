import java.util.*;
class Q13
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		/*if(n1 > n2 && n1 > n3)
		{
			System.out.println(n1+" is the greatest amoung: "+n1+" " +n2+ " " + n3);
		}
		else if(n2 > n3 && n2 > n1)
		{
			System.out.println(n2+" is the greatest amoung: "+n1+" " +n2+ " " + n3);
		}
		else
		{
			System.out.println(n3+" is the greatest amoung: "+n1+" " +n2+ " " + n3);
		}*/
		
		int s;
			s = n3 > (n1 > n2 ? n1:n2) ? n3 : ((n1 > n2)? n1: n2); 
		
		System.out.println(s+" is the greatest amoung: "+n1+", " +n2+ "and " + n3);
		

	
	}
}