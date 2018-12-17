public class PowerV {
	public static void main(String[] args) {
		double v = 1.07;
		double powerOfV = v;
		for (int i = 1; i <= 20; i++) {
			powerOfV = powerOfV * v;
			System.out.println(v + "^" + (i + 1) + " is: " + powerOfV);
		}
	}
}