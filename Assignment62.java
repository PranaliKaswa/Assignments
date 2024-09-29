package p1;


class Google
{
	void login() //Method Overriding
	{
		System.out.println("Login with mobile no.");
	}
}

public class Assignment62 extends Google {
	
	void login()
	{
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		
		Assignment62 m1 = new Assignment62();
		m1.login();
		
	} 
	

}



