/* BirthdayGuess Assignment
 * Name: Jorge
 * ID: V00880059
 * This class guesses the birthday of user.
 */
import java.util.*;

public class BirthdayGuess {
	/* 
	 * Converts number of month to name of the month
	 * @param month a number between 1 and 12
	 * @return the name of the month
	 */
	public static String monthToString(int month) {
		if (month == 1) { return "Jan"; } 
		else if (month == 2) { return "Feb"; } 
		else if (month == 3) { return "Mar"; } 
		else if (month == 4) { return "Apr"; }
		else if (month == 5) { return "May"; }
		else if (month == 6) { return "Jun"; }
		else if (month == 7) { return "Jul"; }
		else if (month == 8) { return "Aug"; }
		else if (month == 9) { return "Sep"; }
		else if (month == 10) { return "Oct"; }
		else if (month == 11) { return "Nov"; }
		else if (month == 12) { return "Dec"; }
		return "";

	}
	/*
	 * Takes in the month and outputs the number of days in that month
	 * @param month a number between 1 and 12
	 * @return number of days in month 
	 */
	public static int numDaysInMonth(int month) {
		switch (month) {
			case 1: return 31;
			case 2: return 29;
			case 3: return 31;
			case 5: return 31;
			case 7: return 31;
			case 8: return 31;
			case 10: return 31;
			case 12: return 31;
			default: return 30;

		}
	}
	/*
	 * Interacts with the user to guess the birthday
	 */
	public static void guessMyBirthday() {
		int monthGuess = 6;
		int dayGuess;
		Scanner input = new Scanner(System.in);
		System.out.print("Is your birthday in " + monthToString(monthGuess) +
		 "? Yes or no: ");
		String answer = input.next();
		while (answer.equalsIgnoreCase("no")) {
			System.out.print("Is your birthday after this month? Yes or no: ");
			answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				//Increase month guess
				monthGuess += 1;
			} else {
				monthGuess -= 1;

			}
			System.out.print("Is your birthday in " + monthToString(monthGuess) + 
				"? Yes or no: ");
			answer = input.next();

		}
		dayGuess = numDaysInMonth(monthGuess) / 2;
		System.out.print("Is your birthday in " + monthToString(monthGuess) + " " + 
			dayGuess + "? Yes or no: ");
		answer = input.next();
		while (answer.equalsIgnoreCase("no")) {
			System.out.print("Is your birthday after this day? Yes or no: ");
			answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				//Increase month guess
				dayGuess += 1;
			} else {
				dayGuess -= 1;

			}
			System.out.print("Is your birthday in " + monthToString(monthGuess) + " " + 
				dayGuess + "? Yes or no: ");
			answer = input.next();

		}
		//find the day!
	}
	public static void main(String[] args) {
		guessMyBirthday();

	}
}