/*
 * Arrays and Scope
 * Name: Jorge
 * ID: V00880059
 */


public class Lab06 {
	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}

		}
	}
	private static void printArray(int[] arr) {
		for (int i: arr) {
			System.out.println(i);

		}
	}
	public static int min(int[] arr) {
		int minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minVal > arr[i]) {
				minVal = arr[i];

			}
		}
		return minVal;
	}
	public static int sum(int[] arr) {
		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add += arr[i];

		} 
		return add;
	}
	public static int max(int[] arr) {
		int maxVal = arr[0];
		for (int i = 0; i < arr.length; i ++) {
			if (maxVal < arr[i]) {
				maxVal = arr[i];

			}
		}
		return maxVal;
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public static void main(String[] args) {
		String[] strings = new String[3];
		strings[0] = "pen";
		strings[1] = "what";

		//System.out.println(strings);
		printArray(strings);
		printArray(args);

		int [] numbers = {1, 2, 3, 4};
		printArray(numbers);
		System.out.println("The biggest number is: " + max(numbers));
		System.out.println("The smallest number is: " + min(numbers));
		System.out.println("The sum of all numbers is: " + sum(numbers));

		int a = 10;
		int b = 15;
		swap (a, b);
		System.out.println(a + ", " + b);
		swap(numbers, 0, 3);
		printArray(numbers);

		

	}
}