/* Author: Paulina Flores
 * Date: 2/23/19
 * Objective: Find the set of smallest factors that compose a number.
 * 
 */
package cop2805c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MathFunc {

	public static List<Integer> allFactors(int n) { // To get all the factors

		List<Integer> factors = new ArrayList<Integer>(); // list

		int increment = n % 2 == 0 ? 1 : 2;

		for (int i = 1; i <= Math.sqrt(n); i += increment) {

			if (n % i == 0) {
				factors.add(i);

				if (i != n / i) {
					factors.add(n / i);
				}

			}
		}

		Collections.sort(factors); // sort the list

		return factors;
	}

	public static List<Integer> SmallestFactors(List<Integer> factors, int n) { // To get the small factors

		List<Integer> small = new ArrayList<Integer>();
		int i;
		while (n != 1) {
			i = 1;
			boolean next = false;
			while (next == false) {
				if (n % factors.get(i) == 0) {
					next = true;
					small.add(factors.get(i));
					n = n / factors.get(i);
				} else
					i++;
			}
		}
		Collections.sort(small); // sort
		return small;

	}

	public static void main(String[] args) { // Main method
		List<Integer> getFactors = new ArrayList<>();
		List<Integer> smallFactors = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		getFactors = allFactors(n);
		smallFactors = SmallestFactors(getFactors, n);

		System.out.println("Factors: " + getFactors);
		System.out.println("Smallest Factors: " + smallFactors);

	}
}
