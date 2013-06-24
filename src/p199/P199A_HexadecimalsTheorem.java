package p199;

import java.util.Scanner;

public class P199A_HexadecimalsTheorem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		if (n < 0) {
			System.out.println("I'm too stupid to solve this problem");
			return;
		} else if (n == 0) {
			System.out.println("0 0 0");
			return;
		} else if (n == 1) {
			System.out.println("0 0 1");
			return;
		} else if (n == 2) {
			System.out.println("0 1 1");
			return;
		}

		int a = 0, b = 1, c = 1, d = 2, e = 3;

		while (e < n) {
			a = b;
			b = c;
			c = d;
			d = e;
			e = c + d;
		}

		System.out.println(a + " " + b + " " + d);
	}
}