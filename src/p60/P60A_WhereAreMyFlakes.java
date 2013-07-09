package p60;

import java.util.Scanner;

public class P60A_WhereAreMyFlakes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hintRight = "To the right of ";
		String hintLeft = "To the left of ";
		String hint = "";
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		int maxRight = 0;
		int minLeft = n + 1;
		int hintValue = -1;

		while (m > 0) {
			hint = scanner.nextLine();

			if (hint.startsWith(hintLeft)) {
				hintValue = Integer.parseInt(hint.substring(hintLeft.length()));

				if (hintValue < minLeft) {
					minLeft = hintValue;
				}
			} else {
				hintValue = Integer
						.parseInt(hint.substring(hintRight.length()));

				if (hintValue > maxRight) {
					maxRight = hintValue;
				}
			}

			m--;
		}

		scanner.close();

		int result = minLeft - maxRight - 1;

		if (result < 1) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}