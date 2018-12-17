import java.text.*;
import java.util.*;

public class FloorAreaExtra {

   public static void customFormat(String pattern, int naveArea) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(naveArea);
      System.out.println("Area of nave:  " + output + " square meters");

	}

	 public static void customFormat2(String pattern, long totalArea) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(totalArea);
      System.out.println("Total surface area of cathedral floor:  " + output + 
      	" square meters");
	
	}
	public static double convert(int units, double value) {
		double result = 0;
		if (units == 1)
			result = value * 10.7639;

		return result;
	}
	public static String callMeMaybe(String pattern, long convert) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(convert);
      return output;

	}

	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);

		int naveArea = 18 * 85;
		customFormat("###,###.###", naveArea);
		long chancelArea = Math.round(0.5 * Math.PI * Math.pow(9, 2));
		System.out.println("Area of chancel: " + chancelArea + 
			" square meters");
		long chapelAreaSmall = Math.round(0.5 * Math.PI * Math.pow(4.5, 2));
		System.out.println("Area of chapel A: " + chapelAreaSmall + 
			" square meters");
		long chapelAreaLarge = Math.round(Math.PI * Math.pow(8, 2));
		System.out.println("Area of chapels B and C: " + chapelAreaLarge + 
			" square meters");
		long chapelsTotalArea = chapelAreaSmall + chapelAreaLarge;
		long totalArea = naveArea + chancelArea + chapelsTotalArea;
		customFormat2("###,###.###", totalArea);

		System.out.println("Enter '1' to convert these dimensions to square feet.");

		int conv = console.nextInt();

		long c = Math.round(convert(conv, naveArea));
		long d = Math.round(convert(conv, chancelArea));
		long e = Math.round(convert(conv, chapelAreaSmall));
		long f = Math.round(convert(conv, chapelAreaLarge));
		long g = Math.round(convert(conv, totalArea));

		System.out.println("Area of nave: " + callMeMaybe("###,###.###", c) + " square feet");
		//System.out.println("Area of chancel: " + customFormat3("###,###.###", d) + " square feet");
		//System.out.println("Area of chapel A: " + customFormat3("###,###.###", e) + " square feet");
		//System.out.println("Area of chapels B and C: " + customFormat3("###,###.###", f) + " square feet");
		//System.out.println("Total surface area of cathedral floor: " + customFormat3("###,###.###", g) +
		//	" square feet");

	}
}