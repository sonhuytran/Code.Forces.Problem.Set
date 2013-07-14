package p328;

import java.util.Scanner;

public class P328A_IQTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int a4 = scanner.nextInt();

		scanner.close();

		int d = a2 - a1;

		if (a3 - a2 == d && a4 - a3 == d) {
			System.out.println(a4 + d);
			return;
		}

		if (a3 * a1 == a2 * a2 && a2 * a4 == a3 * a3) {
			if (a4 * a4 % a3 == 0) {
				System.out.println(a4 * a4 / a3);
				return;
			}
		}

		System.out.println(42);
	}
}
