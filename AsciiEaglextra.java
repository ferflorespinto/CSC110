public class AsciiEaglextra {

	public static void main(String[] args) {
		topWings();
		highTop();
		middle();
		lowPart();
		bottom();
		pole();
		System.out.println("_________________________________________________________");
		starLine();
		line();
	}

	public static void topWings() {
		for (int i = 1; i <= 7; i++) {
		System.out.print(" ");

		}
		System.out.print("__");
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");

		}
		System.out.println("__");

	}
	public static void highTop() {
		System.out.println("      /'(  _  )'\\");
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");

		}
		System.out.print("/");
		for (int i = 1; i <= 3; i++) {
			System.out.print("|");

		}
		System.out.print("\\/^\\/");
		for (int i = 1; i <= 3; i++) {
			System.out.print("|");

		}
		System.out.println("\\");

	}
	public static void middle() {
		for (int i = 1; i <= 4; i++) {
			System.out.print(" ");

		}
		System.out.print("/");
		for (int i = 1; i <= 4; i++) {
			System.out.print("|");

		}
		System.out.print("_'-'_");
		for (int i = 1; i <= 4; i++) {
			System.out.print("|");

		}
		System.out.println("\\");

	}
	public static void lowPart() {
		for (int i = 1; i <= 3; i++) {
			System.out.print(" ");

		}
		System.out.print("/");
		for (int i = 1; i <= 6; i++) {
			System.out.print("|");

		}
		System.out.print(").(");

		for (int i = 1; i <= 6; i++) {
			System.out.print("|");

		}
		System.out.println("\\");

	}

	public static void bottom() {
		for (int i = 1; i <= 2; i++) {
			System.out.print(" ");

		}
		System.out.print("/'");
		for (int i = 1; i <= 5; i++) {
			System.out.print("v");

		}
		System.out.print("/\\_/\\");
		for (int i = 1; i <= 5; i++) {
			System.out.print("v");

		}
		System.out.println("'\\");

	}

	public static void pole() {
		for (int i = 1; i <= 4; i++) {
			System.out.print("-=");

		}
		System.out.print("-\"-V-\"-");
		for (int i =1; i <= 4; i++) {
			System.out.print("=-");

		}
		System.out.println();
	}
	public static void starLine() {
		for (int i = 1; i <= 4; i++) {
		System.out.println("| *   *   *   *   *   * |_______________________________|");
		System.out.println("|   *   *   *   *   *   |_______________________________|");

		}
	}
	public static void line() {
		for (int line = 1; line <= 6; line++) {
			System.out.print("|");
			for (int i = 1; i <= 55; i++) {
				System.out.print("_");

			}
			System.out.println("|");
		}
	}
}