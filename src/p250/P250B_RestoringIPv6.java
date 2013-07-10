package p250;

import java.util.Scanner;

public class P250B_RestoringIPv6 {

	private static String restore(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);

		if (input.contains("::")) {
			int count = 0;

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ':') {
					count++;
				}
			}

			count = 7 - count;

			if (count > 0) {
				int index = stringBuilder.indexOf("::");

				while (count > 0) {
					stringBuilder.insert(index, ':');
					count--;
				}
			} else if (count < 0) {
				int index = stringBuilder.indexOf("::");

				while (count < 0) {
					stringBuilder.deleteCharAt(index);
					count++;
				}
			}
		}

		String[] addresses = stringBuilder.toString().split(":", 8);

		for (int i = 0; i < 8; i++) {
			addresses[i] = ("0000" + addresses[i]).substring(addresses[i]
					.length());
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			result.append(addresses[i]);
			result.append(':');
		}

		result.deleteCharAt(39);
		return result.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		while (n > 0) {
			result.append(restore(scanner.next()));
			result.append('\n');
			n--;
		}

		scanner.close();
		System.out.println(result);
	}
}
