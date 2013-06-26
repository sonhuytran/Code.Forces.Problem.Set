package p122;

import java.util.Scanner;

public class P122B_LuckySubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		int count4 = 0, count7 = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == '4') {
				count4++;
			} else if (ch == '7') {
				count7++;
			}
		}

		if (count4 == 0 && count7 == 0) {
			System.out.println(-1);
		} else if (count4 >= count7) {
			System.out.println('4');
		} else {
			System.out.println('7');
		}
	}
}
