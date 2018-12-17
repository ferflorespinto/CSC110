/*
 * Student Name: Jorge Fernando Flores Pinto 
 * ID: V00880059
 *
 * This class TextAnalysisExtra prints the statistics of a text file provided
 * by the user in the command line. Some of the statistics are: longest
 * word in file, word count, number of unique words used, number of times
 * words with a particular length have appeared, etc. Additional to
 * TextAnalysis's functions, this class prints the text file, calculates
 * the number of characters used, and solves the issue of words being
 * counted as different if they have a punctuation mark (the ones considered 
 * in this class are the most common ones).
 *
 * The class, however, does not count words with "'s" as one word.
 */


import java.util.*;
import java.io.*;

public class TextAnalysisExtra {
	
	/* Looks for a word in a wordlist. Returns the index of the word array if 
	 * successful and -1 if unsuccessful
	 */
	public static int findWord(String[] arrayText, String word) {
		boolean found = false;
		int index = 0;
		//Checks if word is in the array
		for (int i = 0; i < arrayText.length; i++) {
			if (word.equalsIgnoreCase(arrayText[i])) {
				found = true;
				index = i;
			}
		}
		if (found) {
			return index;
		}
		else {
			return -1;
		}	
	}
	
	// Outputs the result of the longest word in the wordlist
	public static void longestWord(String[] arrayText) {
		int lengthOfWord = 0;
		String longestWord = "";
		for (String word: arrayText) {
			if (word != null) {
				if (word.length() > lengthOfWord) {
					longestWord = word;
					lengthOfWord = word.length();
				}
			}
		}
		System.out.println(lengthOfWord + " (\"" + longestWord + "\")");
		
	}
	
	//Counts words in the wordlist
	public static void wordList(String[] arrayText) {
		int wordlist = 0;
		for (String word: arrayText) {
			if (word != null) {
				wordlist++;
			}
		}
		System.out.println(wordlist);

	}
	
	/* 
	 * Outputs the count of word length in the text.
	 * Counts how many words have the same length (between 1 to 10 or above 10)
	 */
	public static void wordAppearance(String[] arrayControl) {
		for (int i = 1; i <= 10; i++) {
			int lengthCount = 0;
			int longLengthCount = 0;
			for (String word: arrayControl) {
				if (word != null) {
					if (word.length() == i && word.length() < 10) {
						lengthCount++;
					}
					else if (word.length() >= 10) {
						longLengthCount++;
					}
				}
			}
			if (i < 10) {
				System.out.println("Word-length " + i + ": " + lengthCount);
			}
			else {
				System.out.println("Word-length >= " + i + ": " + longLengthCount);
			}

		}

	}
	// Outputs the wordlist with their "recurrence" number
	public static void wordDump(String[] arrayText, int[] arrayCount) {
		for (int i = 0; i < arrayCount.length; i++) {
			if (arrayText[i] != null) {
				System.out.println("'" + arrayText[i] + "': " + arrayCount[i]);
			}
		}

	}
	/* Solves the word count issue in textStats, since arrayControl.length
	 * counts the line breaks as well.
	 */
	public static void wordCount(String[] arrayControl) {
		int realWords = 0;
		for (int i = 0; i < arrayControl.length; i++) {
			if (arrayControl[i] != null && arrayControl[i].length() > 0) {
				realWords++;
			}
		}
		System.out.println(realWords);
	}
	// Main function that outputs the statistics
	public static void textStats(String text) {
		//Lets us treat any words with punctuation as one word
		String[] arrayControl = text.split("[ '-,;.?!\r\n]");
		//String[] arrayCompare = text.split("\\s+");
		//Adds words to memory
		String[] arrayText = new String[arrayControl.length];
		//Adds how many times a word has been found
		int[] arrayCount = new int[arrayControl.length];

		boolean found = false;
		int index = 0;
		int order = 0;
		for (String word: arrayControl) {
			//Has the word been found?
			if (word.length() > 0) {
				index = findWord(arrayText, word);
				//Seems like yes!
				if (index >= 0) {
					arrayCount[index]++;
				}
				//Not quite...
				else {
					arrayText[order] = word;
					arrayCount[order]++;
					order++;
				}
			}
		}
		System.out.println("TEXT FILE STATISTICS");
		System.out.println("--------------------");
		
		System.out.println("Total characters: " + text.length());
		
		System.out.print("Length of the longest word: ");
		longestWord(arrayText);	
		
		System.out.print("Number of words in file wordlist: ");
		wordList(arrayText);
		
		System.out.print("Number of words in file: ");
		wordCount(arrayControl);
		
		
		System.out.println();
		
		System.out.println("Word frequency-statistics:");
		wordAppearance(arrayControl);
		
		System.out.println();
		
		System.out.println("Wordlist dump:");
		wordDump(arrayText, arrayCount);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{

		Scanner sc1 = new Scanner(new File(args[0]));
		String text = sc1.useDelimiter("\\A").next();
		sc1.close();
		System.out.println(text);
		System.out.println();
		textStats(text);
		
	}
}