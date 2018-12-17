/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class FutureValue calculates the future investment after interest from
* a particular amount provided by the user.
* All the data is provided by the user, and the calculations the program does
* are based on this data (starting amount, interest rate and number of years).
*
*/

import java.util.*;
import java.text.*;

public class FutureValue {
	public static void main (String[] args) {
		Scanner val = new Scanner (System.in);
		System.out.print("The starting amount: ");
		double amount = val.nextDouble();
		System.out.print("The interest rate in percent: ");
		double interest = val.nextDouble();
		System.out.print("The number of years: ");
		int years = val.nextInt();
		
		DecimalFormat formatter = new DecimalFormat(".00");
		String formattedInvestment;

		System.out.println("Y $");
		//The following method makes the calculations and sets the number of iterations
		for (int i = 0; i <= years; i++) {
			double investment = amount * Math.pow(1 + interest / 100, i);
			formattedInvestment = formatter.format(investment);
			System.out.println(i + " " + formattedInvestment);

		}

	}
}