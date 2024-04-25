/* Author: Paulina Flores
 * Date: 1/26/2019
 * Purpose: write a function that utilizes generics.
 * This function will find and return the maximum element in the array.
 */
package cop2805C;

public class Three {

	public static void main(String[] args) { // main function
		//arrays of String, Integer, and Double
		String[] colors = {"Red","Green","Blue"}; 
		Integer[] numbers = {1, 2, 3};
		Double[] circleRadius = {3.0, 5.9, 2.9};

		
// Output
		System.out.println("Colors: " + max(colors));
		System.out.println("Numbers: " + max(numbers));
		System.out.println("Circle Radius: " + max(circleRadius));
		
		

	
	}

// Generic function that will compare and find max of array
	public static <E extends Comparable<E>> E max (E [] list) {
	E maxElement = list[0];
for (E element : list) {
	if (element.compareTo(maxElement) > 0) {
		maxElement = element;
	}
}
	return maxElement;
		
		

	}
}
