public class Practice {
	public static void main(String[] args) {
		int x = 1;
		while (x < 100) {
			System.out.print(x + " ");
			x += 10;

		}
		int max = 10;
		while (max < 10) {
			System.out.println("count down: " + max);
			max--;

		}
		System.out.println(max);
		String word = "a";
		while (word.length() < 10) {
			word = "b" + word + "b";

		}
		System.out.println(word);

		int y = 100;
		while (x > 0) {
			System.out.println(x / 10);
			x = x / 2;

		}
		int total = 25;
		int number = 1;
		while(number < (total / 2)) {
			total = total - number;
			System.out.println(total + " " + number);
			number++;

		}
		System.out.println();
		int total2 = 25;
		for (int i = 1; i <= (total2 / 2); i++) {
			total2 = total2 - i;
			System.out.println(total2 + " " + i);

		}

	}
}