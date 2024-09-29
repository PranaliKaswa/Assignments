package p1;



interface AMZ
{
	void amazon_registration();
}

interface AMZ_Login extends AMZ
{
	void amazon_login();
}
public class Assignment66 implements AMZ_Login
{

	public static void main(String[] args) 
	{
            
		Assignment66 a1 = new Assignment66();
		a1.amazon_registration();
		a1.amazon_login();
	}

	@Override
	public void amazon_registration() {
		
		System.out.println("Registration Done");
		
	}

	@Override
	public void amazon_login() {

        System.out.println("Login with mobile no.");
	}

	

}
