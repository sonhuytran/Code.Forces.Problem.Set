package p169;

import java.util.Arrays;
import java.util.Scanner;

public class P169B_ReplacingDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		String s = scanner.next();
		scanner.close();

		StringBuilder result = new StringBuilder(n);
		char[] replacings = s.toCharArray();
		Arrays.sort(replacings);

		int indexn = 0, indexs = replacings.length - 1;

		while (indexn < result.length() && indexs >= 0) {
			if (result.charAt(indexn) < replacings[indexs]) {
				result.setCharAt(indexn, replacings[indexs]);
				indexs--;
			}

			indexn++;
		}

		System.out.println(result);
	}
}
