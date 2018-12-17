/*
* Student Name: Jorge Fernando Flores Pinto 
* ID: V00880059
*
* This class EagleSpeaks prints out an ASCII drawing of an eagle saying
* in a text bubble whatever the user inputs.
* Two methods were defined. The first one, printEagle(), draws the eagle
* and the lines that link the eagle to the text box, as if it were saying
* the message input. The second one, speak(), prompts the user to input a
* message. It also draws the text bubble based on the length of the
* message input.
*
*/

import java.util.*;

public class EagleSpeaks {
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
	public static void speak() {
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like the eagle to say? ");
		//Takes the message from the user
		String message = input.nextLine();
		int count = message.length();
		printEagle();
		System.out.print("*");
		//Sets the necessary iterations for "-" characters
		for (int i = 1; i <= count + 2; i++) {
			System.out.print("-");

		}
		System.out.println("*");
		System.out.println("| " + message + " |");
		System.out.print("*");
		for (int i = 1; i <= count + 2; i++) {
			System.out.print("-");

		}
		System.out.println("*");

	}

	public static void main (String [] args) {
		speak();

	}
}
