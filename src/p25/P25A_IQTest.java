package p25;

import java.util.Scanner;

public class P25A_IQTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int number = 0, even = 0, lastEven = -1, lastOdd = -1;

		for (int i = 1; i <= n; i++) {
			number = scanner.nextInt();

			if (number % 2 == 0) {
				even++;
				lastEven = i;
			} else {
				lastOdd = i;
			}
		}

		scanner.close();

		if (even == 1) {
			System.out.println(lastEven);
		} else {
			System.out.println(lastOdd);
		}
	}
}
