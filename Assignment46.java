package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment46 

{
	
	
	public static void main(String[] args)
	
	{
		List li = new ArrayList(); //upcasting

			li.add(null); 
			li.add("Pranali"); 
			li.add(100);
			li.add(89.346);
			li.add('A');
			li.add(100); 
			
			System.out.println("Using List Interface");
			
			
			ListIterator i2 = li.listIterator();
			while(i2.hasNext())	
			{
				System.out.println(i2.next());
			}
			
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}
			}	

			}
		
			
			


	
						
						
	


				
				
