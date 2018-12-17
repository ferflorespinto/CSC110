public class BubbleSort {
	public static void switchArray(int[] a, int i, int j) {
		int b = a[i];
		a[i] = a[j];
		a[j] = b;

	}

	public static int[] sort(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					switchArray(a, j, j - 1);

				}
			}
		}
		return a;

	}
	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {5, 10, 9, 3, 29, 45, 0, 78};
		printArray(a);
		sort(a);
		printArray(a);

	}
}

//*Z*Z*Z
