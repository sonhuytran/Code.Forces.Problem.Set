package p315;

import java.util.Scanner;

public class P315B_SerejaAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int operation = 0, param1 = 0, param2 = 0;
		long sum = 0;

		long[] numbers = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			numbers[i] = scanner.nextLong();
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < m; i++) {
			operation = scanner.nextInt();

			if (operation == 1) {
				param1 = scanner.nextInt();
				param2 = scanner.nextInt();
				numbers[param1] = param2 - sum;
			} else if (operation == 2) {
				param1 = scanner.nextInt();
				sum += param1;
			} else {
				param1 = scanner.nextInt();
				stringBuilder.append(numbers[param1] + sum);
				stringBuilder.append('\n');
			}
		}

		scanner.close();
		System.out.println(stringBuilder.toString().trim());
	}
}
