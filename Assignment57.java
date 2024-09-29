package p1;


class First {
	
	void add()
	{
		System.out.println("add");
	}
	
	static void sub()
	{
		System.out.println("sub");
	}
	
}
public class Assignment57  extends First
	{
		static void mul()
		{
			System.out.println("mul");
		}
		
		public static void main(String[] args) {
		
		
		Assignment57 s1 = new Assignment57();
		s1.add();
		sub();
		mul();
		
		
	}
	
	}


