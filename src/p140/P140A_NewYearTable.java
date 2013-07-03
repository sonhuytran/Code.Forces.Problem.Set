package p140;

import java.util.Scanner;

public class P140A_NewYearTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int R = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();

		if (n == 1) {
			if (r <= R) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			return;
		}

		if (n == 2) {
			if (r * 2 <= R) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			return;
		}

		int b = R - r;
		int a = r * 2;
		double cosa = 1 - a * a * 1.0 / (2 * b * b);
		double angle = Math.acos(cosa);

		if (angle * n / 2 <= Math.PI + 1e-12) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		//
		// System.out.println(angle * n / 2);
		// System.out.println(Math.PI);
	}
}
