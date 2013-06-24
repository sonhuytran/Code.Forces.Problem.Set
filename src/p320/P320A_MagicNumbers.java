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

		boolean result = input.matches("((1)|(14)|(144))*");
		System.out.println(result ? "YES" : "NO");
	}
}
