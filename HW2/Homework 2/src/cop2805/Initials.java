/*
 * Author: Paulina Flores
 * Date: 1/19/2020
 * Purpose: Create a program to demonstrate the use of Collections methods reverse, fill, copy.
 */
package cop2805;
import java.util.*; 


public class Initials {
	
	public static void main(String[] args) 
	{
		String space = " ";
		// 1. Create and output a list of three characters
	List names = new ArrayList();
	names.add("P");
	names.add("E");
	names.add("F");
	
	System.out.println("Initial List: ");
	Output(names);
	System.out.println(space);
	
	// 2. Reverse and output the list
	Collections.reverse(names);
	System.out.println("Reversed List: ");
	Output(names);
	System.out.println(space);
	
	// 3. Copy list
	List copyNames = new ArrayList();
	copyNames.add("M");
	copyNames.add("E");
	copyNames.add("C");
	
	// 4. Copy the contents of list in step one into copy list of the step three, output the copied list. 
	Collections.copy(copyNames, names);
	System.out.println("Copied List: ");
	Output(copyNames);
	System.out.println(space);
	
	// 5. Fill the initial list with the letter R and output the list.
	Collections.fill(names, "R");
	System.out.println("R Filled List: ");
	Output(names);
	System.out.println(space);
	
	
	}

	// 6. Create a method named output and display the characters in your list	
	public static void Output(List names) {
		for (Iterator i = names.iterator(); i.hasNext();) {
			Object obj = i.next();
			System.out.print(obj + " ");
		}
		
	}

}
