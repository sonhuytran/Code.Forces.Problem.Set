package p246;

import java.util.Scanner;

public class P246B_IncreaseAndDecrease {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}

		scanner.close();

		if (sum % n == 0) {
			System.out.println(n);
		} else {
			System.out.println(n - 1);
		}
	}
}
