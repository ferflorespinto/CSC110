/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class FloorArea calculates the floor area of a cathedral
* based on the parameters provided.
* First, areas of individual parts of the cathedral are
* calculated. After calculating all parts, all areas
* are added together to print out the total area of the
* cathedral floor.
*
*/

public class FloorArea {
	public static void main (String[] args) {
		int naveArea = 18 * 85;
		System.out.println("Area of nave: " + naveArea + 
			" square meters");
		double chancelArea = 0.5 * Math.PI * 9 * 9;
		System.out.println("Area of chancel: " + chancelArea + 
			" square meters");
		double chapelAreaSmall = 0.5 * Math.PI * 4.5 * 4.5;
		System.out.println("Area of chapel A: " + chapelAreaSmall + 
			" square meters");
		double chapelAreaLarge = Math.PI * 8 * 8;
		System.out.println("Area of chapels B and C: " + chapelAreaLarge + 
			" square meters");
		double chapelsTotalArea = chapelAreaSmall + chapelAreaLarge;
		double totalArea = naveArea + chancelArea + chapelsTotalArea;
		System.out.println("Total surface area of the cathedral floor: " + 
			totalArea + " square meters");

	}
}