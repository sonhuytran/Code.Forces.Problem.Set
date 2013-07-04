package c327;

import java.util.Scanner;

public class C327A_FlippingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		byte[] numbers = new byte[n];
		int count = 0, count1 = 0;

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextByte();

			if (numbers[i] > 0) {
				count1++;
			}
		}

		scanner.close();
		int maxCount = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int max = Integer.MIN_VALUE;
			count = count1;

			for (int j = i; j < n; j++) {
				if (numbers[j] > 0) {
					count--;
				} else {
					count++;
				}

				if (count > max) {
					max = count;
				}
			}

			if (max > maxCount) {
				maxCount = max;
			}
		}

		System.out.println(maxCount);
	}
}
