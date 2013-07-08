package p278;

import java.util.Scanner;

public class P278B_NewProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		StringBuilder input = new StringBuilder();

		while (n > 0) {
			input.append(scanner.nextLine());
			input.append(' ');
			n--;
		}

		scanner.close();

		StringBuilder result = new StringBuilder("a");
		int index = 0;
		char z = 'z';

		do {
			if (input.indexOf(result.toString()) < 0) {
				System.out.println(result);
				return;
			}

			index = result.length() - 1;

			while (index >= 0 && result.charAt(index) == z) {
				index--;
			}

			if (index < 0) {
				for (int i = 0; i < result.length(); i++) {
					result.setCharAt(i, 'a');
				}

				result.append('a');
			} else {
				result.setCharAt(index, (char) (result.charAt(index) + 1));

				for (int i = index + 1; i < result.length(); i++) {
					result.setCharAt(i, 'a');
				}
			}
		} while (true);
	}
}
