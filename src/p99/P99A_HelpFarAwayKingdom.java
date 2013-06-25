package p99;

import java.util.Scanner;

public class P99A_HelpFarAwayKingdom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();

		String[] parts = number.split("\\.");
		String intPart = parts[0];
		String fracPart = parts[1];

		if (intPart.endsWith("9")) {
			System.out.println("GOTO Vasilisa.");
			return;
		}

		char first = fracPart.charAt(0);

		if (first < '5') {
			System.out.println(intPart);
			return;
		}

		int pos = intPart.length() - 1;
		char last = intPart.charAt(pos);
		StringBuilder stringBuilder = new StringBuilder(intPart);
		stringBuilder.setCharAt(pos, (char) (last + 1));

		System.out.println(stringBuilder);
	}
}
