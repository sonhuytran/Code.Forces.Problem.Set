package p109;

import java.util.Scanner;

public class P109A_LuckySumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int max7 = n / 7;

		for (int i = max7; i >= 0; i--) {
			if ((n - 7 * i) % 4 == 0) {
				int num4 = (n - 7 * i) / 4;
				StringBuilder result = new StringBuilder();

				for (int j = 0; j < num4; j++) {
					result.append(4);
				}

				for (int j = 0; j < i; j++) {
					result.append(7);
				}

				System.out.println(result);
				return;
			}
		}

		System.out.println(-1);
	}
}