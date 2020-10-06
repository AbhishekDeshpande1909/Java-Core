import java.util.Scanner;
class Q20
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a lower range number: ");
		int low = sc.nextInt();
		
		System.out.print("Enter a upper range number: ");
		int high = sc.nextInt();
		
		
			System.out.println("\n Prime numbers between "+low+" and "+high+" are: ");
        while (low < high) 
		{
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) 
			{
                if(low % i == 0)
				{
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                System.out.println(low);

            low++;
		}
	}
}