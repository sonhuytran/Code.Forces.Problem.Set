package p248;

import java.util.Scanner;

public class P248B_ChillyWilly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		if (n < 3) {
			System.out.println(-1);
			return;
		}

		if (n == 3) {
			System.out.println(210);
			return;
		}

		StringBuilder numberStringBuilder = new StringBuilder("1");
		int max = n - 3;

		for (int i = 1; i < max; i++) {
			numberStringBuilder.append('0');
		}

		String[] ms = { "170", "020", "200", "110", "050", "080" };
		numberStringBuilder.append(ms[n % 6]);
		System.out.println(numberStringBuilder);
	}
}
