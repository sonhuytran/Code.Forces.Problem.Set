package p245;

import java.util.Scanner;

public class P245B_InternetAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		StringBuilder result = new StringBuilder(input);

		if (input.startsWith("http")) {
			result.insert(4, "://");
		} else if (input.startsWith("ftp")) {
			result.insert(3, "://");
		}

		int index = result.lastIndexOf("ru");

		if (index > -1) {
			result.insert(index, ".");
			index++;

			if (index < result.length() - 2) {
				result.insert(index + 2, "/");
			}
		}

		System.out.println(result);
	}
}
