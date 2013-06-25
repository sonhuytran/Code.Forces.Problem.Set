package p260;

import java.util.Scanner;

public class P260A_AddingDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		int temp = a * 10;
		boolean hasResult = false;

		for (int i = 0; i < 10; i++) {
			if ((temp + i) % b == 0) {
				hasResult = true;
				a = temp + i;
				break;
			}
		}

		if (!hasResult) {
			System.out.println(-1);
			return;
		}

		StringBuilder result = new StringBuilder();
		result.append(a);

		// if (a % b == 0) then ((a * 10) % b == 0)
		for (int i = 1; i < n; i++) {
			result.append("0");
		}

		System.out.println(result);
	}
}
