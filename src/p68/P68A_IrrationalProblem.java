package p68;

import java.util.Scanner;

public class P68A_IrrationalProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int p3 = scanner.nextInt();
		int p4 = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		scanner.close();
		int min = Math.min(Math.min(Math.min(p1, p2), p3), p4);

		if (min <= a) {
			System.out.println(0);
		} else if (b < min) {
			System.out.println(b - a + 1);
		} else {
			System.out.println(min - a);
		}
	}
}
