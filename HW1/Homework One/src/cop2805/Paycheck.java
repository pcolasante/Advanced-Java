/* Author: Paulina Flores
 * Date: 1/12/19
 * Objective: To create a program that will calculate the amount of sales along with the commission rate.
 * You will start with the sales amount $1,000 and increment it by $1,000 up to $20,000 in sales.
 * 
 */

package cop2805;

import java.text.DecimalFormat;

public class Paycheck {

	public static void main(String[] args) {
		double salesAmount;
		double earnings;

		DecimalFormat newFormat = new DecimalFormat("0.00"); // formatting
		System.out.println("Sales:          Income: "); // part of the output

		for (salesAmount = 1000.00; salesAmount <= 20000.00; salesAmount += 1000.00) { // loop
			earnings = computeIncome(salesAmount);

			System.out.println("$" + newFormat.format(salesAmount) + "           $" + newFormat.format(earnings)); // formatting to decimals in the output

		}

	}

	public static double computeIncome(double salesAmount) { // method to compute earnings
		double result = 0;
		double maximumOfTier = 5000; // to avoid miscalculation between tiers
		double baseSalary = 5000; // base salary of the employer
		if (0.00 <= salesAmount && salesAmount <= 5000) { // first tier of 8%
				result = baseSalary + (salesAmount * 0.08); // calculation
				
		} else if (5000.01 <= salesAmount && salesAmount <= 10000) { // second tier of 10%
			salesAmount = salesAmount - 5000;		
			result = baseSalary + (maximumOfTier * 0.08) + (salesAmount * 0.1); // calculation
			} else if (10000.01 <= salesAmount) { // third tier of 12%
				salesAmount = salesAmount - 10000;
					result = baseSalary + (maximumOfTier * 0.08) + (maximumOfTier * 0.10) + (salesAmount * 0.12); // calculation
				}
		
		return result;

	}

}
