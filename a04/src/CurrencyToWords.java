/*
 * Student Name: Jorge Fernando Flores Pinto 
 * ID: V00880059
 *
 * This class CurrencyToWords 'converts' numbers to words, and outputs the number
 * the user provides in words, plus any decimal amount. This program's output
 * resembles a cheque. Additionally, the program checks the input of the user
 * to verify if it's a number. If it's not, it will keep asking for a valid input
 * until the user provides a number.
 *
 */

import java.util.*;

//Takes a value a converts it into words
public class CurrencyToWords {
	public static String baseCardinalToString(int value) {
		if (value == 90) {
			return "ninety";

		}
		else if (value == 80) {
			return "eighty";

		}
		else if (value == 70) {
			return "seventy";

		}
		else if (value == 60) {
			return "sixty";

		}
		else if (value == 50) {
			return "fifty";

		}
		else if (value == 40) {
			return "forty";

		}
		else if (value == 30) {
			return "thirty";

		}
		else if (value == 20) {
			return "twenty";

		}
		else if (value == 19) {
			return "nineteen";

		}
		else if (value == 18) {
			return "eighteen";

		}
		else if (value == 17) {
			return "seventeen";

		}
		else if (value == 16) {
			return "sixteen";

		}
		else if (value == 15) {
			return "fifteen";

		}
		else if (value == 14) {
			return "fourteen";

		}
		else if (value == 13) {
			return "thirteen";

		}
		else if (value == 12) {
			return "twelve";

		}
		else if (value == 11) {
			return "eleven";

		}
		else if (value == 10) {
			return "ten";

		}
		else if (value == 9) {
			return "nine";

		}
		else if (value == 8) {
			return "eight";

		}
		else if (value == 7) {
			return "seven";

		}
		else if (value == 6) {
			return "six";

		}
		else if (value == 5) {
			return "five";

		}
		else if (value == 4) {
			return "four";

		}
		else if (value == 3) {
			return "three";

		}
		else if (value == 2) {
			return "two";

		}
		else if (value == 1) {
			return "one";

		}
		else if (value == 0) {
			return "";

		}
		else {
			return "";
		}
	}
	//Gives the format of the cheque
	public static String format(String s, int length, int money) {
		System.out.print(s);
		System.out.print(" ");
		//Prints an extra space if value input does not have cents
		if (money == 0) {
			for (int i = length; i <= 54; i++) {
				System.out.print("-");

			}
		}
		else {
			for (int i = length; i <= 53; i++) {
				System.out.print("-");

			}
		}
		System.out.print(" ");
		System.out.print(money + "/100 dollars");
		return "";

	}
	/* Makes all necessary calculations to pass them on to baseCardinalToString.
	 * It divides 'value' into units, tens, hundreds, and thousands, based on the
	 * input provided by the user.
	 */ 
	public static String convertToWords(double value) {
		//casts 'value' to an integer
		int newInt = (int) value;
		String s1 = "";
		//units is the variable for units
		int units = newInt % 10;
		//dec is the variable for tens
		int dec = (newInt % 100) - units;
		//hund is the variable for hundreds
		int hund = newInt / 100;
		//thou is the variable for thousands
		int thou = newInt / 1000;
		//'rounding' variable fixes part of the approximation for when input has decimals
		double rounding = value * 100 + 0.5;
		rounding = (int) rounding;
		rounding = rounding / 100.00;
		//to obtain just the decimal part of the input
		double cents = rounding - newInt;
		//numberCents fixes the other part of the approximation
		double numberCents = cents * 100 + 0.5;
		int newCents = (int) numberCents;
		//newDec is used whenever the last two numbers of value are between 10 and 19
		int newDec = newInt - (hund * 100);
		if (newInt == 0) {
			s1 = "zero";

		}
		else {
			//if value < 100
			if (hund == 0) {
				if (newInt >= 10 && newInt <= 19) {
					s1 = baseCardinalToString(newInt);

				}
				else {
					//if 1 <= value <= 9
					if (dec == 0) {
						s1 = baseCardinalToString(units);

					}
					else {
						//for values not ending with zero
						if (units != 0) {
							s1 = baseCardinalToString(dec) + "-" + 
							baseCardinalToString(units);

						}
						//for values ending with zero
						else {
							s1 = baseCardinalToString(dec);

						}
					}	
				}
			} 
			//if 100 <= value <= 999
			else if (hund <= 9) {
				//if last two numbers are between 10 and 19
				if (newDec >= 10 && newDec <= 19) {
					s1 = baseCardinalToString(hund) + " hundred and " + 
						baseCardinalToString(newDec);

				}
				//if tens are equal to zero
				else if (dec == 0) {
					if (units != 0) {
						s1 = baseCardinalToString(hund) + " hundred and " + 
							baseCardinalToString(units);

					}
					else {
						s1 = baseCardinalToString(hund) + " hundred";

					}
				}
				else {
					if (units != 0) {
						s1 = baseCardinalToString(hund) + " hundred and " + 
							baseCardinalToString(dec) + "-" + 
							baseCardinalToString(units);

					}
					//if 'value' ends with zero
					else {
						s1 = baseCardinalToString(hund) + " hundred and " +
							baseCardinalToString(dec);

					}
				}
			}
			if (thou < 1) {

			}
			/* for 1000 <= value <= 20999.
			 * The rest of the conditions repeat from previous steps
			 */
			else if (thou >= 1) {
				hund = (newInt % 1000) / 100;
				if (hund > 0) {
					if (dec == 10) {
						s1 = baseCardinalToString(thou) + " thousand " + 
							baseCardinalToString(hund) + " hundred and " +
							baseCardinalToString(newDec);

					}
					else if (dec > 0) {
						if (units != 0) {
							s1 = baseCardinalToString(thou) + " thousand " + 
								baseCardinalToString(hund) + " hundred and " + 
								baseCardinalToString(dec) + "-" + 
								baseCardinalToString(units);
						}
						else {
							s1 = baseCardinalToString(thou) + " thousand " +
							baseCardinalToString (hund) + " hundred and " +
							baseCardinalToString(dec);

						}
					}
					else if (dec == 0) {
						if (units != 0) {
							s1 = baseCardinalToString(thou) + " thousand " + 
								baseCardinalToString(hund) + " hundred and " + 
								baseCardinalToString(units);

						}
						else {
							s1 = baseCardinalToString(thou) + " thousand " +
							baseCardinalToString (hund) + " hundred";

						}
					}
				}
				else if (hund == 0) {
					newDec = newInt - (thou * 1000);
					if (dec == 10) {
						s1 = baseCardinalToString(thou) + " thousand and " +
							baseCardinalToString(newDec);

					}
					else if (dec == 0) {
						if (units != 0) {
							s1 = baseCardinalToString(thou) + " thousand and " +
								baseCardinalToString(units);

						}
						else {
							s1 = baseCardinalToString(thou) + " thousand";

						}

					}
					else {
						if (units != 0) {
							s1 = baseCardinalToString(thou) + " thousand and " +
								baseCardinalToString(dec) + "-" + 
								baseCardinalToString(units);
						}
						else {
							s1 = baseCardinalToString(thou) + " thousand and " +
								baseCardinalToString(dec);

						}
					}
				}
			}
		}
		return format(s1, s1.length(), newCents);

	}
	/* Receives input from user and checks if input is a number.
	 * If it's not a number, it repeats the request until the user gives
	 * a valid value.
	 */
	public static double getValueFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the monetary amount? ");
		while (! input.hasNextDouble()) {
			System.out.println("Sorry, invalid input. Please enter a valid input: ");
			String value = input.nextLine();

		}
		double value = input.nextDouble();
		return value;

	}
	public static void main(String[] args) {
		double value = getValueFromUser();
		String text = convertToWords(value);
		System.out.println(text);

	}
}