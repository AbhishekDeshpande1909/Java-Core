import java.util.Scanner;
class Student
{
	int rno;
	String name;
	
	void setData(int roll, String Name)
	{
		rno = roll;
		name = Name;
	}
	
	void showData()
	{
		System.out.println("Entered roll no: "+rno);
		System.out.println("Entered name: "+name);
	}
}

class Q31
{
	public static void main (String args[])
	{
		Student s = new Student();
		s.setData(3,"Abhi");
		s.showData();
		s.setData(91,"Shravani");
		s.showData();		

	}
}