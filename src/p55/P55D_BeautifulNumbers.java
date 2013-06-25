package p55;

import java.util.Scanner;

public class P55D_BeautifulNumbers {

	private static boolean isBeautiful(long number) {
		boolean[] digits = new boolean[10];

		while (number > 0) {
			int digit = (int) number % 10;

			if (digit > 1 && !digits[digit]) {
				if (number % digit != 0) {
					return false;
				}

				digits[digit] = true;
			}

			number /= 10;
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] left = new long[n];
		long[] right = new long[n];

		for (int i = 0; i < n; i++) {
			left[i] = scanner.nextLong();
			right[i] = scanner.nextLong();
		}

		scanner.close();

		for (int i = 0; i < n; i++) {
			long count = 0;

			for (long j = left[i]; j <= right[i]; j++) {
				if (isBeautiful(j)) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}
