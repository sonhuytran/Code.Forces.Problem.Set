package p334;

import java.util.Scanner;

public class P334A_CandyBags {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = n / 2;
		scanner.close();

		StringBuilder result = new StringBuilder();
		int i = 1, j = n * n;

		for (int k = 0; k < n; k++) {
			for (int l = 0; l < m; l++) {
				result.append(i++);
				result.append(' ');
			}

			for (int l = 0; l < m; l++) {
				result.append(j--);
				result.append(' ');
			}

			result.append('\n');
		}

		System.out.println(result);
	}
}
