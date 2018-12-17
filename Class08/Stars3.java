public class Stars3 {

	public static void line(int length) {
		for (int i = 1; i <= length; i++) {
		System.out.print("*");

		}
		System.out.println();

	}

	public static void box(int length, int height) {
		line(length);
		for (int i = 1; i <= height - 2; i++) {
			System.out.print("*");
			for(int j = 1; j <= length - 2; j++) {
				System.out.print(" ");

			}
			System.out.println("*");

		}
		line(length);

	}
	public static void main(String[] args) {
		box(10,3);

	}

}
