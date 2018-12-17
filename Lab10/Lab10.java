public class Lab10 {
	public static int findMax(int[] a) {
		int max = 0;
		//int maxDiff = 0;
		for(int i = 0; i < a.length; i++) {
			//maxDiff = Math.abs(a[i] - a[i - 1]);
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static int findMin(int[] a) {
		int min = 0;
		for(int i = 1; i < a.length; i++) {
			min = a[a.length - 1];
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] a = {5, 10, 9, 3, 29, 45, 0, 78};
		int max = findMax(a);
		int input = 46;
		int maxDiff = Math.abs(input - max);
		int newDiff = 0;
		int newNum = 0;
		for(int i = 0; i < a.length; i++) {
			newDiff = Math.abs(input - a[i]);
			if(newDiff <= maxDiff) {
				maxDiff = newDiff;
				newNum = input - maxDiff;

			}
		}
		System.out.println(newNum);
	}
}