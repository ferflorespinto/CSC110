import java.util.*;

public class CalendarExtraDraft {

	//Prints the top and bottom parts of the calendar
	public static void printSeparator() {
		for (int i = 1; i <= 7; i++) {
			System.out.print("+");
			for (int j = 1; j <= 5; j++) {
				System.out.print("-");

			}

		}
		System.out.println("+");

	}
	//Gives indentation to numbers of the calendar
	public static String rightJustify(int value, int spaces) {
		String n = "" + value;
		for (int i = n.length(); i < spaces; i++) {
			n = " " + n;

		}
		return n;

	}
	//Gives indentation to blank spaces
	public static String spaceRightJustify(String blank, int spaces) {
		for (int i = blank.length(); i < spaces; i++) {
			blank = " " + blank;

		}
		return blank;		

	}
	/*
	 * Prints the numbers of the calendar and their respective divisions.
	 * The first Sunday is given by startingSunday, and the number of days
	 * is given by numDays.
	 */
	public static void outputCalendar(int numDays, int startingSunday) {
		//Prints first week of calendar if startingSunday > 1
		if (startingSunday > 1) {
	 		System.out.print("|");
			for (int i = 7; i >= 1; i--) {
				int prev = startingSunday - i;
				//prev is the previous week's days with respect to startingSunday

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

		}
		//Prints the calendar
		for (int i = 0; i <= Math.floor((numDays - startingSunday) / 7); i++) {
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
		System.out.print("Enter any number if you want to see what next month looks like. ");
		int number = input.nextInt();
		if (days == 31) {
			System.out.println("   Su    Mo    Tu    We    Th    Fr    Sa");
			printSeparator();
			outputCalendar(days - 1, Math.abs(date - 4) + 1);
			printSeparator();
			
		}
		else if (days == 30) {
			System.out.println("   Su    Mo    Tu    We    Th    Fr    Sa");			
			printSeparator();
			outputCalendar(days + 1, Math.abs(date - 3) + 1);
			printSeparator();	

		}

	}
}