class Q3
{
	public static void main(String ar[])
	{
		int x = 10;
		int y1 = 20;
		int y;
		int z;
		//Condition A
		//y = x*x + 3*x -7;
		//System.out.println("y = "+y);
		
		//Condition B
		//y = x++ + ++x;
		//System.out.println("y = "+y+ "\nx = " +x);
		
		//Condition C
		//z = x++ - --y1 - --x + x++;
		//System.out.println("z = "+z+"\ny = "+y1+ "\nx = " +x);
		
		//Condition D
		boolean z2;
		boolean x2 = false;
		boolean y2 = false;
		z2 = x2 && y2 || !(x2 || y2);
		System.out.println(z2);
	}
}