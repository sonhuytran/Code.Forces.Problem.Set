package p131;

import java.util.Scanner;

public class P131C_TheWorldIsATheatre {

	private static long c(long n, long k) {
		long result = 1;

		if (k < n / 2) {
			k = n - k;
		}

		for (long i = k + 1, j = 1; i <= n; i++, j++) {
			result *= i;
			result /= j;
		}

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		long t = scanner.nextLong();

		scanner.close();

		long sum = 0;

		for (long boys = Math.max(4, t - m), girls = t - boys; boys <= Math
				.min(n, t - 1); boys++, girls--) {
			sum += c(n, boys) * c(m, girls);
		}

		System.out.println(sum);
	}
}
