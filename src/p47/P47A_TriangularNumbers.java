package p47;

import java.util.Scanner;

public class P47A_TriangularNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		x = x * 8 + 1;
		int sqrt = (int) Math.sqrt(x);

		if (sqrt * sqrt == x) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
