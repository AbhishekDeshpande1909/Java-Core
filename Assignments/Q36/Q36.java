import java.util.Scanner;
class MathOperation
{

	
	double ans;
	void mul(int i1,int i2)
	{
		ans = i1*i2;		
		System.out.println("Mul of two numbers is: "+ans);
	}

	void mul(float f1,float f2,float f3)
	{
		ans = f1*f2*f3;		
		System.out.println("Mul of two numbers is: "+ans);
	}

	void mul(int arr[])
	{
		double ans1=1;
		for(int i=0;i<5;i++)
		{
			ans1 = ans1 * arr[i];	
		}
		System.out.println("Mul of array elements is: "+ans1);
	}
	
	void mul(double d1,int i1)
	{
		ans = d1*i1;		
		System.out.println("Mul of two numbers is: "+ans);
	}
}

class Q36
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter first number (int): ");
		int n1 = sc.nextInt();				
		System.out.println("Enter second number (int): ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter first number (float): ");
		float f1 = sc.nextFloat();				
		System.out.println("Enter second number (float): ");
		float f2 = sc.nextFloat();
		System.out.println("Enter third number (float): ");
		float f3 = sc.nextFloat();
		
		System.out.println("Enter first number (double): ");
		double d1 = sc.nextDouble();				
		System.out.println("Enter second number (int): ");
		int i1 = sc.nextInt();
		
		System.out.print("Enter array elements: ");
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		MathOperation s = new MathOperation();
		s.mul(n1,n2);
		s.mul(f1,f2,f3);
		s.mul(d1,i1);	
		s.mul(arr);

	}
}