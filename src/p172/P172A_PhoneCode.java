package p172;

import java.util.Scanner;

public class P172A_PhoneCode {

	private static int findCommon(String string1, String string2, int max) {
		for (int i = 0; i < max; i++) {
			if (string1.charAt(i) != string2.charAt(i)) {
				return i;
			}
		}

		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String common = scanner.nextLine();
		int result = common.length();

		for (int i = 1; i < n; i++) {
			String next = scanner.nextLine();
			result = findCommon(common, next, result);
		}

		scanner.close();
		System.out.println(result);
	}
}
