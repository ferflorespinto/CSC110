public class Lab08 {
	public static void printArray(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				String print = arr[i][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}
	public static void swapRows(int row1, int row2, String[][] arr) {
		String[] temp = arr[row1];
		arr[row1] = arr[row2];
		arr[row2] = temp;

	}
	/*public static void swapRowsAlt(String[][] arr) {
		for(int i = arr.length; i < 0; i--) {
			for(int j = 0; j < arr[i - 1].length; j++) {
				String print = arr[i - 1][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}*/
	public static void swapCols(int col1, int col2, String[][] arr) {
		for(int i = 0; i < arr[col1].length; i++) {
			String temp = arr[i][col1];
			arr[i][col1] = arr[i][col2];
			arr[i][col2] = temp;

		}
	}

	public static void main(String[] args) {
		String[][] letters = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

		printArray(letters);
		System.out.println();
		swapRows(1, 2, letters);
		printArray(letters);
		//swapRowsAlt(letters);
		swapCols(1, 2, letters);
		printArray(letters);


	}
}