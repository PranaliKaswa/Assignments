package p1;
public class Assignment32 {
	
	public static void main(String[] args) {
		
		String input = "School";
        System.out.println("My String is - " +input);
        
        String output = "";
        for(int i = input.length()-1;i>=0;i--)
        {
        	char c1 = input.charAt(i);
        	output = output+c1;
           

        }
        
        System.out.println("The reverse String is - "+output);
	}

}
