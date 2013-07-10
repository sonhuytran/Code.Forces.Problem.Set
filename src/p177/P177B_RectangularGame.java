package p177;

import java.util.Scanner;

public class P177B_RectangularGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		long result = n;
		int max = (int) Math.sqrt(n), i = 2;

		while (n > 1 && i <= max) {
			while (n % i == 0) {
				n /= i;
				result += n;
			}

			i++;
		}

		if (n > 1) {
			result += 1;
		}

		System.out.println(result);
	}
}