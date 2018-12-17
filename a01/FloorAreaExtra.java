/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class FloorAreaExtra calculates the floor area of a cathedral
* based on the parameters provided.
* Here, the  areas are approximated to the nearest integer with the
* 'Math.round' function. The numbers that are larger than 1000 appear with
* a comma (i.e. "1,000") with the customFormat function.
* The program also asks the user to make an input if he wants the
* values to be converted to square feet. If the user makes the 
* correct input, the program will display all the areas in square
* feet.
*
*/

import java.text.*;
import java.util.*;

public class FloorAreaExtra {

	//to give a comma to values larger or equal to 1000 (for example, "1,001")
   public static String customFormat(String pattern, long value) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      return output;

	}

	//this function provides the conversion factor to square feet
	public static double convert(int units, double value) {
		double result;
		//for the program to identify the input given by the user
		result = 0;
		if (units == 1)
			result = value * 10.7639;
		return result;
	}

	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);

		int naveArea = 18 * 85;
		System.out.println("Area of nave: " + customFormat("###,###.###", naveArea) + " square meters");
		long chancelArea = Math.round(0.5 * Math.PI * Math.pow(9, 2));
		System.out.println("Area of chancel: " + customFormat("###,###.###", chancelArea) +
			" square meters");
		long chapelAreaSmall = Math.round(0.5 * Math.PI * Math.pow(4.5, 2));
		System.out.println("Area of chapel A: " + customFormat("###,###.###", chapelAreaSmall) +
			" square meters");
		long chapelAreaLarge = Math.round(Math.PI * Math.pow(8, 2));
		System.out.println("Area of chapels B and C: " + customFormat("###,###.###", chapelAreaLarge) +
			" square meters");
		long chapelsTotalArea = chapelAreaSmall + chapelAreaLarge;
		long totalArea = naveArea + chancelArea + chapelsTotalArea;
    System.out.println("Total surface area of cathedral floor:  " + customFormat("###,###.###", totalArea) +
      " square meters");

		System.out.println("Enter '1' to convert these dimensions to square feet.");

		//takes the input entered
		int conv = console.nextInt();

		//converts each area to square feet
		long c = Math.round(convert(conv, naveArea));
		long d = Math.round(convert(conv, chancelArea));
		long e = Math.round(convert(conv, chapelAreaSmall));
		long f = Math.round(convert(conv, chapelAreaLarge));
		long g = Math.round(convert(conv, totalArea));

		System.out.println("Area of nave: " + customFormat("###,###.###", c) + " square feet");
		System.out.println("Area of chancel: " + customFormat("###,###.###", d) + " square feet");
		System.out.println("Area of chapel A: " + customFormat("###,###.###", e) + " square feet");
		System.out.println("Area of chapels B and C: " + customFormat("###,###.###", f) + " square feet");
    	System.out.println("Total surface area of cathedral floor:  " + customFormat("###,###.###", g) +
      " square feet");

	}
}