package p46;

import java.util.Scanner;

public class P46A_BallGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		StringBuilder results = new StringBuilder(n * 2);
		int current = 0, step = 1;

		for (int i = 0; i < n - 1; i++) {
			current = (current + step) % n;
			step++;
			results.append(current + 1);
			results.append(" ");
		}

		System.out.println(results);
	}
}
