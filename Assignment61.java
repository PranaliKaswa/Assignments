package p1;




public class Assignment61 {

	
	
	
	Assignment61(int a)
	{
		this("Pranali");
		System.out.println("2");
		
	}
	Assignment61()
	{
		
		System.out.println("1");
		
	}
	
	public static void main(String[] args) {
		
		
		Assignment61 c1 = new Assignment61(100);
		
	}
	
	Assignment61(String a)
	{
		this();
		System.out.println("3");
	}
}
