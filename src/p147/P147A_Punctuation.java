package p147;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P147A_Punctuation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int length = input.length();
		scanner.close();

		int index = 0;
		String punctuations = ",.?!";
		char ch;
		List<String> tokens = new ArrayList<String>();

		while (index < length) {
			ch = input.charAt(index);

			if (Character.isAlphabetic(ch)) {
				StringBuilder token = new StringBuilder();

				do {
					token.append(ch);
					index++;

					if (index < length) {
						ch = input.charAt(index);
					}
				} while (index < length && Character.isAlphabetic(ch));

				tokens.add(token.toString());
			} else if (punctuations.contains(String.valueOf(ch))) {
				tokens.add(String.valueOf(ch));
				index++;
			} else {
				index++;
			}
		}

		StringBuilder result = new StringBuilder();
		String token;
		index = 0;

		while (index < tokens.size()) {
			if (punctuations.contains(token = tokens.get(index))) {
				do {
					result.append(token);
					index++;

					if (index < tokens.size()) {
						token = tokens.get(index);
					}
				} while (index < tokens.size() && punctuations.contains(token));
			} else {
				if (index > 0) {
					result.append(' ');
				}
				
				result.append(token);
				index++;
			}
		}
		
		System.out.println(result);
	}
}
