package p279;

import java.util.Scanner;

public class P279B_Books {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		scanner.close();

		int max = 0, sum = 0, index = 0;

		while (sum < t && index < n) {
			sum += a[index++];
		}

		if (sum > t) {
			index--;
			sum -= a[index];
		}

		max = index;

		for (int i = 0; i < n - 1; i++) {
			sum -= a[i];

			while (sum < t && index < n) {
				sum += a[index++];
			}

			if (sum > t) {
				index--;
				sum -= a[index];
			}

			if (index - i - 1 > max) {
				max = index - i - 1;
			}
		}

		System.out.println(max);
	}
}
