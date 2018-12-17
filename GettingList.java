import java.util.*;
import java.io.*;

public class GettingList {
	public static int[] getList(Scanner console, int size) {
		int [] data = new int[size];
		for(int i = 0; i < size; i++) {
			data[i] = console.nextInt();

		}
		return data;

	}
	public static void printList(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers = input.nextInt();
		printList(getList(input, 4));
	}
}