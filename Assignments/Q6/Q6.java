import java.util.*;
class Q6
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		int r = sc.nextInt();
		float pi = 3.14f;
		float area;
		float circum;
		
		area = pi*r*r;
		circum = 2*pi*r;
		
		System.out.printf("\n\tArea of the circle is: %.2f",area);		
		System.out.printf("\n\tCircumference of the circle is: %.2f",circum);

	
	}
}