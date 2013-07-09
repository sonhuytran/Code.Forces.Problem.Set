package p197;

import java.util.Scanner;

public class P197A_PlateGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();

		if (r * 2 > (a >= b ? b : a)) {
			System.out.println("Second");
		} else {
			System.out.println("First");
		}
	}
}
