package p258;

import java.util.Scanner;

public class P258A_LittleElephantAndBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder input = new StringBuilder(scanner.nextLine());
		scanner.close();

		int index = input.indexOf("0");

		if (index > 0) {
			input.deleteCharAt(index);
		} else {
			input.deleteCharAt(0);
		}

		System.out.println(input);
	}
}
