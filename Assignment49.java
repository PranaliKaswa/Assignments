package p1;



public class Assignment49 {
	
	
	Assignment49() // Constructor
	{
		System.out.println("This is a Constructor");
	}
	
	
	
	Assignment49(int a) //Parameterized Constructor
	{
		System.out.println("This is para constructor");
	}
	
	Assignment49(char b)
	{
		System.out.println("this is non static");
	}
	public static void main(String[] args) {
		
		new Assignment49();
		new Assignment49(10);
		//Constructor n1 = new Constructor();
		new Assignment49('A');
		
		
	}
	
	
}
