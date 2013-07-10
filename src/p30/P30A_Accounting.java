package p30;

import java.util.Scanner;

public class P30A_Accounting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		if (a == 0) {
			if (b == 0) {
				System.out.println(18);
			} else {
				System.out.println("No solution");
			}

			return;
		}

		if (b % a != 0) {
			System.out.println("No solution");
			return;
		}

		int xn = b / a;

		if (xn < 0) {
			if (n % 2 == 0) {
				System.out.println("No solution");
			} else {
				int x = (int) (-Math.pow(-xn, 1.0 / n));

				if (Math.pow(x, n) == xn) {
					System.out.println(x);
				} else {
					System.out.println("No solution");
				}
			}
		} else {
			int x = (int) Math.pow(xn, 1.0 / n);

			if (Math.pow(x, n) == xn) {
				System.out.println(x);
			} else if (Math.pow(x + 1, n) == xn) {
				System.out.println(x + 1);
			} else {
				System.out.println("No solution");
			}
		}
	}
}
