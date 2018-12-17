import java.util.*;
import java.io.*;

public class FileProcessing {
	public static void boyGirl() throws FileNotFoundException {
		Scanner input = new Scanner(new File("names.txt"));
		int sumBoy = 0;
		int sumGirl = 0;
		int count = 0;
		int number = 0;
		int countBoy = 0;
		int countGirl = 0;
		while(input.hasNext()) {
			if(input.hasNextInt()) {
				number = input.nextInt();
				count++;
				if(count % 2 == 0) {
					sumGirl += number;
					countGirl++;

				}
				else {
					sumBoy += number;
					countBoy++;

				}

			}
			else {
				input.next();

			}

		}
		System.out.println(countBoy + " boys, " + countGirl + " girls");
		System.out.println("Difference between boys' and girls' sums: " + 
			Math.abs(sumBoy - sumGirl));

	}
	public static void evenNumbers() throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers.txt"));
		int evenCount = 0;
		int count = 0;
		int sum = 0;
		int number = 0;

		while(input.hasNextInt()) {
			number = input.nextInt();
			//System.out.print(number + " ");
			if (number % 2 == 0) {
				evenCount++;

			}
			sum += number;
			count++;
			//input.next();
		}
		double evenPercent = ((evenCount * 1.0) / (count * 1.0)) * 100.00;
		System.out.println(count + " numbers, sum = " + sum);
		System.out.println(evenCount + " evens (" + evenPercent + "%)");

	}
	public static boolean negativeSum(String filename) throws FileNotFoundException {
		Scanner input = new Scanner(new File(filename));
		int number = 0;
		int sum = 0;
		int steps = 0;
		boolean isNegative = false;
		while(input.hasNextInt()) {
			number = input.nextInt();
			sum += number;
			steps++;
			if(sum < 0) {
				System.out.println("sum of " + sum + " after " + steps + " steps");
				isNegative = true;
				break;

			}

		}
		if(sum >= 0) {
			System.out.println("no negative sum");

		}
		return isNegative;

	}
	public static void countCoins() throws FileNotFoundException {
		Scanner input  = new Scanner(new File("coins.txt"));
		double number = 0;
		double total = 0;
		double sum = 0;
		String coin = "";
		while(input.hasNext()) {
			double pennies = 0;
			double nickels = 0;
			double dimes = 0;
			double quarters = 0;
			if(input.hasNextInt()) {
				number = input.nextInt();

			}
				coin = input.next();
				if(coin.equalsIgnoreCase("pennies")) {
					pennies = number / 100.0;

				}
				else if (coin.equalsIgnoreCase("nickels")) {
					nickels = (number / 20.0);

				}
				else if(coin.equalsIgnoreCase("dimes")) {
					dimes = number / 10.0;

				}
				else if(coin.equalsIgnoreCase("quarters")) {
					quarters = (number / 4.0);

				}
			sum = pennies + nickels + dimes + quarters;
			total += sum;

		}
		System.out.println("Total money: $" + total);

	}
	public static void collapseSpaces() throws FileNotFoundException {
		Scanner input = new Scanner(new File("spaces.txt"));
		String word = "";
		while(input.hasNext()) {
			word = input.next();
			System.out.print(word + " ");

		}
		System.out.println();
	}
	public static void flipLines() throws FileNotFoundException {
		Scanner input = new Scanner(new File("flip.txt"));
		String line1 = "";
		String line2 = "";
		String flipper = "";
		while(input.hasNextLine()) {
			line1 = input.nextLine();
			if(input.hasNextLine()) {
				line2 = input.nextLine();
				flipper = line1;
				line1 = line2;
				line2 = flipper;
			}
			System.out.println(line1);
			System.out.println(line2);
		}
	}
	public static void doubleSpace() throws FileNotFoundException {
		PrintStream output = new PrintStream(new File("flip2.txt"));
		Scanner input = new Scanner(new File("flip.txt"));
		while(input.hasNextLine()) {
			output.println(input.nextLine());
			output.println();
		}
	}
	public static void wordWrap() throws FileNotFoundException {
		Scanner input = new Scanner(new File("names.txt"));
		String line = "";
		String subLine = "";
		while(input.hasNextLine()) {
			line = input.nextLine();
			System.out.println(line.length());
			if(line.length() > 20) {
				int times = (line.length()) / 20;
				int i = 1;
				while(i <= times) {
					subLine = line.substring((i - 1) * 20, 20 * i);
					System.out.println(subLine);
					i++;
				}
				if((line.length()) % 20 != 0) {
					subLine = line.substring(20 * i);
					System.out.println(subLine);
				}
			}
			else {
				System.out.println(line);
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		boyGirl();
		System.out.println();
		evenNumbers();
		System.out.println();
		negativeSum("sum1.txt");
		negativeSum("sum2.txt");
		System.out.println();
		countCoins();
		System.out.println();
		collapseSpaces();
		System.out.println();
		flipLines();
		//doubleSpace();
		wordWrap();

	}
}