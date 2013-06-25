package p279;

import java.util.Scanner;

public class P279A_Point0nSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();

		int result = 0;

		if (y == 0) {
			result = (0);
		} else if (y > 0) {
			if (x > 0) {
				result = (4 * y - 3);
			} else {
				result = (4 * y - 2);
			}
		} else {
			if (x > 0) {
				result = (4 * (-y));
			} else {
				result = (4 * (-y) - 1);
			}
		}

		System.out.println(result);
	}
}
