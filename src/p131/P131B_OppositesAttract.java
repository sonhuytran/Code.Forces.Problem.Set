package p131;

import java.util.Scanner;

public class P131B_OppositesAttract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] counts = new long[21];

		for (int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			counts[number + 10]++;
		}

		scanner.close();

		long count = 0;

		for (int i = 0; i < 10; i++) {
			count += counts[i] * counts[20 - i];
		}

		count += counts[10] * (counts[10] - 1) / 2;

		System.out.println(count);
	}
}
