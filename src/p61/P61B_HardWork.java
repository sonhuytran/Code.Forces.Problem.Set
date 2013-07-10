package p61;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P61B_HardWork {

	private static String normalize(String input) {
		StringBuilder stringBuilder = new StringBuilder(input.toLowerCase());
		String sign = "-_;";

		for (int i = 0; i < stringBuilder.length();) {
			if (sign.indexOf(stringBuilder.charAt(i)) > -1) {
				stringBuilder.deleteCharAt(i);
			} else {
				i++;
			}
		}

		return stringBuilder.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = normalize(scanner.next());
		String string2 = normalize(scanner.next());
		String string3 = normalize(scanner.next());

		String[] possibleResults = new String[] { string1 + string2 + string3,
				string1 + string3 + string2, string2 + string1 + string3,
				string2 + string3 + string1, string3 + string1 + string2,
				string3 + string2 + string1 };
		List<String> possibles = Arrays.asList(possibleResults);
		StringBuilder result = new StringBuilder();

		int n = scanner.nextInt();
		String input = "";
		final String wrong = "WA", right = "ACC";

		while (n > 0) {
			input = normalize(scanner.next());

			if (possibles.contains(input)) {
				result.append(right);
			} else {
				result.append(wrong);
			}

			result.append('\n');
			n--;
		}

		scanner.close();
		System.out.println(result);
	}
}
