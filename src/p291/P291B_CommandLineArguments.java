package p291;

import java.util.Scanner;

public class P291B_CommandLineArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		int index = 0, i = 0;
		StringBuilder result = new StringBuilder();

		while (index < input.length()) {
			while (index < input.length() && input.charAt(index) == ' ') {
				index++;
			}

			if (index >= input.length()) {
				break;
			}

			if (input.charAt(index) == '\"') {
				i = index + 1;

				while (input.charAt(i) != '\"') {
					i++;
				}

				result.append('<');
				result.append(input.substring(index + 1, i));
				result.append(">\n");
				index = i + 1;
			} else {
				i = index + 1;

				while (i < input.length() && input.charAt(i) != ' ') {
					i++;
				}

				result.append('<');
				result.append(input.substring(index, i));
				result.append(">\n");
				index = i + 1;
			}
		}

		System.out.println(result.toString().trim());
	}
}
