import java.util.Scanner;

class Student
{
	String name;
	int roll,age,score;
	Student(){}
	Student(String name, int roll, int age, int score)
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
		this.score=score;
	}
	void disp()
	{
		System.out.println(name+" "+roll+" "+age+" "+score);
		if(score <= 50)
		{
			System.out.println("Less than 50: "+score);
		}
		else if(score > 50 && score < 65)
		{
			System.out.println("Between 50 and 65: "+score);
		}
		else if(score > 65 && score < 80)
		{
			System.out.println("Between 65 and 80: "+score);
		}
		else if(score > 80 && score < 100)
		{
			System.out.println("Between 80 and 100: "+score);
		}				
	}
}

class Q40
{
	 
	public static void main(String args[])
	{
	int roll;
	 int age;
	 int score;
	 Student ar [] = new Student[3];
		Scanner sc = new Scanner(System.in);
		int lesFif[] = new int[3];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter name");			
			//sc.nextLine();
			String name = sc.next();

			System.out.println("Enter roll");			
			 roll = sc.nextInt();			

			System.out.println("Enter age");			
			 age = sc.nextInt();			

			System.out.println("Enter score");			
			 score = sc.nextInt();
			
			Student s = new Student(name,roll,age,score);
			ar[i] = s;
			
		}
//		s.disp();			
		}
}