package p284;

import java.util.Scanner;

public class P284B_CowsAndPokerGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();
		scanner.close();

		int ni = 0, na = 0;

		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == 'I') {
				ni++;
			} else if (input.charAt(i) == 'A') {
				na++;
			}
		}

		if (ni > 1) {
			System.out.println(0);
		} else if (ni == 1) {
			System.out.println(1);
		} else {
			System.out.println(na);
		}
	}
}
