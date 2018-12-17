/*
 * Calculate Pi using a Monte Carlo Simulation
 * Name: Jorge Flores
 * ID: V00880059
 *
 */
import java.util.Random;

class Pi {

	/* Tells us if a point is inside the unit circle
	 * @param point 2D point in space
	 * @returns true if the point is inside the circle
	 */
	 public static boolean inCircle(double[] point) {
	 	return (point[0] * point[0] + point[1] * point[1] <= 1);


	}
	/* Generates points inside the unit square
	 * @param rng Random number generator
	 * @returns 2D point
	 */
	public static double[] genPoint(Random rng) {
		//x, y, z
		double[] point = {rng.nextDouble(), rng.nextDouble()};
		return point;

	}
	private static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}

	public static void main(String[] args) {
		int totalPoints, pointsInCircle = 0;

		totalPoints = Integer.parseInt(args[0]);

		Random rng = new Random();
		//double[][] testPoints = {{0, 1}, {0, 0}, {1, 0}, {1, 1}};
		for (int i = 0; i < totalPoints; i++) {
			//printArray(testPoints[i]);
			if (inCircle(genPoint(rng))) {
				pointsInCircle++;

			}
			//System.out.println(inCircle(testPoints[i]));

		}
		//printArray(genPoint(rng));
		//printArray(genPoint(rng));
		System.out.println(4.0 * pointsInCircle / totalPoints);


	}
}