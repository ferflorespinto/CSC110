/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class FutureValueExtra calculates how many years the user needs to
* achieve a desired investment based on the amount, the amount he desires to invest,
* and the interest rate. The class also prints out the amount invested for each year,
* until the one he reaches the goal, so that the user can check the exact value 
* he will invest in the final year (and previous years as well). The class stops
* printing out amounts of investment when it reaches the year the user gets to the
* goal.
*
* Finally, this class also converts each value into Euros and Canadian dollars. It
* also prints out the values under the "$###,###.00" format. 
*
*/

import java.util.*;
import java.text.*;

public class FutureValueExtra {
	public static void main (String[] args) {
		Scanner val = new Scanner (System.in);
		System.out.print("The starting amount: ");
		double amount = val.nextDouble();
		System.out.print("How much do you want to invest? ");
		double earn = val.nextDouble();
		System.out.print("The interest rate in percent: ");
		double interest = val.nextDouble();

		//Gives a format easier to read and with currency symbol
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		String formattedValues;
		String formattedCad;

		DecimalFormat formatterEuro = new DecimalFormat("€###,###.00");
		String formattedEuro;

		double earnings = amount + earn;

		formattedValues = formatter.format(earnings);

		System.out.println("Expected amount: " + formattedValues);

		//Calculates the number of years need to reach investment desired
		double years = (Math.log10(earnings / amount)) / (Math.log10(1 + (interest / 100)));

		System.out.println("You will need " + Math.ceil(years) + 
			" years to reach that investment! Refer to the chart below:");

		/* Prints out the table with values of all years up to final year
		 * in three currencies.
		 */
		System.out.println("Y      $           €          CAD");
		for (int i = 0; i <= Math.ceil(years); i++) {
			double investment = amount * Math.pow(1 + interest / 100, i);
			double euro = investment * 0.891382;
			double cad = investment * 1.31490;
			formattedCad = formatter.format(cad);
			formattedEuro = formatterEuro.format(euro);
			formattedValues = formatter.format(investment);
			System.out.println(i + "  " + formattedValues + "  " + formattedEuro
			 + "  " + formattedCad);

		}

	}
}







