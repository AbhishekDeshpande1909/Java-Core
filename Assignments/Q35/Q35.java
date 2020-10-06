import java.util.Scanner;
import java.math.*;
class MathOperation
{

	
		double ans;
		void add(int n1,int n2)
	{
		ans = n1+n2;		
		System.out.println("Add of two numbers is: "+ans);
	}
	
	void sub(int n1,int n2)
	{
		ans = n1-n2;		
		System.out.println("Sub of two numbers is: "+ans);
		}
	
	void mul(int n1,int n2)
	{
		ans = n1*n2;		
		System.out.println("Mul of two numbers is: "+ans);
		}
	
	void power(int n1,int n2)
	{
		ans = Math.pow(n1,n2);		
		System.out.println("Add of two numbers is: "+ans);
	}
}

class Q35
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();				
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		MathOperation s = new MathOperation();
		s.add(n1,n2);
		s.sub(n1,n2);
		s.mul(n1,n2);
		s.power(n1,n2);		

	}
}