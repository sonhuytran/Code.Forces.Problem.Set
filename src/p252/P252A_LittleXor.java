package p252;

import java.util.Scanner;

public class P252A_LittleXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		int max = Integer.MIN_VALUE, xor = 0;

		for (int i = 0; i < n; i++) {
			xor = 0;

			for (int j = i; j < n; j++) {
				xor ^= numbers[j];

				if (xor > max) {
					max = xor;
				}
			}
		}

		System.out.println(max);
	}
}
