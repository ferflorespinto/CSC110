/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class EagleSpeaksExtra prints out an ASCII drawing of an eagle saying
* in a text bubble whatever the user inputs, just as in EagleSpeaks.
* EagleSpeaksExtra, however, solves the issue of the text bubble dividing if
* a text input is too long. This way, the message is printed out as a paragraph
* within the text box and the latter is not "disfigured".
* Moreover, every line was given a maximum length, so whenever the text reaches
* that threshold, the rest of the message jumps to the next line, and so on.
*
*/


import java.util.*;

public class EagleSpeaksExtra {
	public static void printEagle() {
		System.out.println("\\                /");
		System.out.println(" \\             /*/");
		System.out.println("  \\\\\\' ,      / //");
		System.out.println("   \\\\\\//    _/ //'");
		System.out.println("    \\_-//' /  //<'");
		System.out.println("     \\*///  <//'");
		System.out.println("     /  >>  *\\\\\\`");
		System.out.println("    /,)-^>>  _\\`");
		System.out.println("    (/   \\\\ / \\\\\\");
		System.out.println("         //  //\\\\\\");
		System.out.println("   /     ((");
		System.out.println("  /");

	}
	/* The following divides the input into separate words
	 * Then, it builds every line of text and adds words one by one in each line
	 * based on the maximum length of the line, defined in speak() as messageLength.
	 */ 
	public static void addLineBreaks(String input, int maxLineLength) {
		StringTokenizer tok = new StringTokenizer(input, " ");
		StringBuilder output = new StringBuilder(input.length());
		//lineLen variable will count the length of the lines
		int lineLen = 0;
		//"format" for each of the lines
		String alignFormat = "| %-" + maxLineLength + "s |%n";
		
		while (tok.hasMoreTokens()) {
			String word = tok.nextToken() + " ";
			
			/* Conditional for when length of the line and the word (space included) 
			 * is more than the maximum length defined. The program will delete
			 * the rest of the string and only print out what fits within the
			 * maximum length.
			 */
			if (lineLen + word.length() > maxLineLength) {
				System.out.printf(alignFormat, output.toString());
				lineLen = 0;
				output.delete(0, output.length());

			}
			//Will add words
			output.append(word);
			//Updates the length of the line to be the same as length of word.
			lineLen += word.length();

		}
		//Prints out the spacing format
		System.out.printf(alignFormat, output.toString());

	}
	
	public static void speak() {
		int messageLength = 40;
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like the eagle to say? ");
		String message = input.nextLine();
		int count = messageLength;
		printEagle();
		System.out.print("+");
		//Iterations of "-"
		for (int i = 1; i <= count + 2; i++) {
			System.out.print("-");

		}
		System.out.println("+");
		
		//Conditions the length of "message", per line
		addLineBreaks(message, messageLength);
		
		System.out.print("+");
		for (int i = 1; i <= count + 2; i++) {
			System.out.print("-");

		}
		System.out.println("+");
	}

	public static void main (String [] args) {
		speak();
	}
}