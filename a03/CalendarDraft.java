import java.util.*;

public class CalendarDraft {

	public static void printSeparator() {
		for (int i = 1; i <= 7; i++) {
			System.out.print("+");
			for (int j = 1; j <= 5; j++) {
				System.out.print("-");

			}

		}
		System.out.println("+");

	}
	public static String rightJustify(int value, int spaces) {
		String n = "" + value;
		for (int i = n.length(); i < spaces; i++) {
			n = " " + n;

		}
		return n;

	}
	public static String spaceRightJustify(String blank, int spaces) {
		for (int i = blank.length(); i < spaces; i++) {
			blank = " " + blank;

		}
		return blank;		

	}
	public static void outputCalendar(int numDays, int startingSunday) {
		System.out.print("|");
		for (int i = 7; i >= 1; i--) {
			int prev = startingSunday - i;

			if (prev <= 0) {
				System.out.print(spaceRightJustify("", 4));
				System.out.print(" |");

			}
			else {
				System.out.print(rightJustify(prev, 4));
				System.out.print(" |");
			}

		}
		System.out.println();

		for (int i = 0; i <= Math.floor(numDays / 7); i++) {
			System.out.print("|");
			for (int j = 1; j <= 7; j++) {
				int oldD =  startingSunday + (j - 1);				
				int newD = oldD + i * 7;				

				if (newD > numDays) {
					System.out.print(spaceRightJustify("", 4));
					System.out.print(" |");

				}
				else {
					System.out.print(rightJustify(newD, 4));
					System.out.print(" |");

				}

			}
			System.out.println();

		}

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of days in month? ");
		int days = input.nextInt();
		System.out.print("Date of first Sunday? ");
		int date = input.nextInt();

		System.out.println("   Su    Mo    Tu    We    Th    Fr    Sa");
		printSeparator();
		outputCalendar(days, date);
		printSeparator();

	}

}