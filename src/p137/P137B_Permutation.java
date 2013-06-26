package p137;

import java.util.Scanner;

public class P137B_Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), number = 0, count = 0;
		boolean[] exists = new boolean[n + 1];

		for (int i = 0; i < n; i++) {
			number = scanner.nextInt();

			if (number > 0 && number <= n) {
				if (!exists[number]) {
					exists[number] = true;
					count++;
				}
			}
		}

		scanner.close();
		System.out.println(n - count);
	}
}
