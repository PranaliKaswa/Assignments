package p1;



public class Assignment50 {

	int a=100;// non static a is Global Variable which is declared inside the class and outside the method
	static char d = 'M'; // static global variable
	void add()
	{
		char name = 'N';
		System.out.println(name);
	}
	
	float b = 2.4f; // b is Global
	
	public static void main(String[] args) {
		
		int c =100; // local variable because main method is also a mthod
		System.out.println(d); // utilization of static global var
		Assignment50 n1 = new Assignment50();// utilization of non static global var
		System.out.println(n1.a);
		//GlobalVariable n2 = new GlobalVariable();// utilization of non static global var
		n1.add();
		
		
		
		
	} 
}



