package p320;

import java.util.Scanner;

public class P320A_MagicNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		StringBuilder stringBuilder = new StringBuilder(input);
		boolean result = true;

		while (stringBuilder.length() > 0) {
			if (stringBuilder.length() >= 3
					&& stringBuilder.substring(0, 3).equals("144")) {
				stringBuilder.delete(0, 3);
			} else if (stringBuilder.length() >= 2
					&& stringBuilder.substring(0, 2).equals("14")) {
				stringBuilder.delete(0, 2);
			} else if (stringBuilder.substring(0, 1).equals("1")) {
				stringBuilder.delete(0, 1);
			} else {
				result = false;
				break;
			}
		}

		System.out.println(result ? "YES" : "NO");
	}
}
