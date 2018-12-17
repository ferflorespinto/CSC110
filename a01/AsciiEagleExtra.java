/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class AsciiEagleExtra prints the figure of an eagle and
* the flag of the United States. Different from the original 
* assignment AsciiEagle, this class uses the nested for loops method to
* print out the eagle and the flag. I made a new eagle. This
* eagle is symmetrical, unlike the original eagle of the
* assignment. Using nested for loops in the original eagle
* would have been pointless, since the eagle is asymmetrical.
* It was impractical to use nested for loops.
*
* Thus, in the new eagle, nested for loops method came in handy.
* The nested for loops method was also used for the US flag.
*
* In the following, the eagle consists of seven lines/parts.
* The flag consists of fifteen lines, but I divided it in three parts.
*
*/

public class AsciiEagleExtra {

	public static void main(String[] args) {
		topWings();
		System.out.println("      /'(  _  )'\\");
		highTop();
		middle();
		lowPart();
		bottom();
		pole();
		System.out.println("_________________________________________________________");
		starLine();
		line();
	}

	//produces the first line of the eagle.
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

	//produces the third line of the eagle.
	public static void highTop() {
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

	//produces the fourth line of the eagle.
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

	//produces the fifth line of the eagle.
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

	//produces the sixth line of the eagle.
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

	//produces the seventh line of the eagle.
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

	//produces the fifty stars of the flag.
	public static void starLine() {
		for (int i = 1; i <= 4; i++) {
		System.out.println("| *   *   *   *   *   * |_______________________________|");
		System.out.println("|   *   *   *   *   *   |_______________________________|");

		}
	}

	//produces the remaining stripes of the flag.
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