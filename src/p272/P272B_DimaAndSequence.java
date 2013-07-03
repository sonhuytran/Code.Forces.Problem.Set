package p272;

import java.util.Scanner;

public class P272B_DimaAndSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long count[] = new long[32];
		int number = -1, result = -1;

		for (int i = 0; i < n; i++) {
			number = scanner.nextInt();
			result = 0;

			while (number > 0) {
				if (number % 2 == 1) {
					result++;
				}

				number /= 2;
			}

			count[result]++;
		}

		scanner.close();
		long countResult = 0;

		for (int i = 0; i < count.length; i++) {
			long temp = count[i];
			countResult += temp * (temp - 1) / 2;
		}

		System.out.println(countResult);
	}
}
