package p1;

import java.util.ArrayList;
import java.util.List;

public class Assignment31 {
	
	public static void main(String[] args)
	{	
		List li = new ArrayList(); //upcasting
		{
			li.add(null); //accept null values
			li.add("Pranali"); // list is heterogenous
			li.add(100);
			li.add(89.346);
			li.add('A');
			li.add(100); //accepts duplicates
			
		List li1 = new ArrayList();
		{
			li1.add("man");
		    li1.add("woman");
		    li1.addAll(li);
			System.out.println(li1);
			
			li1.removeAll(li)	; // removeAll
			System.out.println("After removeAll method : - " +li1);
	}

		}
	}
}
	
