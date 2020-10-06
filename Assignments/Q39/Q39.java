import java.util.Scanner;
class Product
{
	int pid;
	int price;
	int quantity;
	Product(int pid, int price,int quantity)
	//Product(int price)
	{
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	void pro(Product p[])
	{
		
	}
	void disp()
	{
		
		System.out.println(pid+" has the highest rice i.e.: "+price);
	}
}

class Q39
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[3];	
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Enter pid: ");
			int pid = sc.nextInt();
			
			System.out.print("Enter price: ");
			int price = sc.nextInt();
			
			System.out.print("Enter quantity: ");
			int quantity = sc.nextInt();
			Product p = new Product(pid,price,quantity);	
			//Product p = new Product(price);
			arr[i]=p;		
		}
		int max=0;
		for(int i =0;i<arr.length;i++)
		{
			int highPrice = arr[i].price;
			if(max < arr[i].price)
			{	
				max = max+arr[i].price;
				arr[i].price = max-arr[i].price;
				max = max-arr[i].price;	
			if(max == highPrice)
			{
				System.out.println(arr[i].pid+" Largest price is: "+max);
				
			}				
			}

		}
		System.out.println("\n Largest price is: "+max);


	}
}