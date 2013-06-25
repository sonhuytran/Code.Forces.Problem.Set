package p203;

import java.util.Scanner;

public class P203A_TwoProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int t = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int da = scanner.nextInt();
		int db = scanner.nextInt();
		scanner.close();

		boolean possible = false;

		for (int i = 0; i < t; i++) {
			if (x == a - da * i || x == b - db * i || x == 0) {
				possible = true;
				break;
			}

			for (int j = 0; j < t; j++) {
				if (x == a - da * i + b - db * j) {
					possible = true;
					break;
				}
			}

			if (possible) {
				break;
			}
		}

		System.out.println(possible ? "YES" : "NO");
	}
}
