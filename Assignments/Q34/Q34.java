import java.util.Scanner;
class Circle
{
	int r;
	double area,pi=3.14;
	
	void init()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		r = sc.nextInt();
	}
	
	void cal()
	{
		area = pi*r*r;
	}
	
	void disp()
	{
		System.out.print("Area of circle is: "+area);
	}
}

class Q34
{
	public static void main (String args[])
	{
		Circle s = new Circle();
		s.init();
		s.cal();
		s.disp();		

	}
}