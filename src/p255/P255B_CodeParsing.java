package p255;

import java.util.Scanner;

public class P255B_CodeParsing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		int countx = 0, county = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'x') {
				countx++;
			} else {
				county++;
			}
		}

		StringBuilder result = new StringBuilder();

		while (countx > county) {
			result.append('x');
			countx--;
		}

		while (county > countx) {
			result.append('y');
			county--;
		}

		System.out.println(result);
	}
}