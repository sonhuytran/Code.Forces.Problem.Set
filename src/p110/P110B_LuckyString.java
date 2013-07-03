package p110;

import java.util.Scanner;

public class P110B_LuckyString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		StringBuilder stringBuilder = new StringBuilder(n + 4);
		String temp = "abcd";

		while (stringBuilder.length() < n) {
			stringBuilder.append(temp);
		}

		System.out.println(stringBuilder.substring(0, n));
	}
}
