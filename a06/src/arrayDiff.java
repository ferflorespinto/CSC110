import java.util.Random;

public class arrayDiff {
	public static void assignDots(String[][] arr) {
		System.out.println("  | 0 1 2 3 4 5 6 7");
		System.out.println("-------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + " | ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ".";
				String print = arr[i][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}
	public static void printArray(String[][] arr) {
		System.out.println("  | 0 1 2 3 4 5 6 7");
		System.out.println("-------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + " | ");
			for(int j = 0; j < arr[i].length; j++) {
				String print = arr[i][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}
	public static String[][] reckonPoints(int a, int b, String[][] arr) {
		int reckoning = 1;
		String strReck = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(Math.abs(a - i) == 1 || (a - i) == 0) {
					if(arr[i][j] != "X") {
						/*if (Math.abs(b - j) > 1) {
							strReck = "1";
							arr[i][j] = strReck;

						}*/
						if(Math.abs(b - j) == 1 || (b - j) == 0) {
							strReck = reckoning + "";
							arr[i][j] = strReck;

						}

					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int b = 0;
		int a = 0;
		String [][] array = new String [2][8];
		assignDots(array);
		for(int i = 1; i <= 2; i++) {
			a = rand.nextInt(2);
			b = rand.nextInt(8);
			array [a][b] = "X";
			reckonPoints(a, b, array);
		}
		System.out.println();		
		//printArray(array);
		//System.out.println();
		printArray(array);
		System.out.println();

	}
}