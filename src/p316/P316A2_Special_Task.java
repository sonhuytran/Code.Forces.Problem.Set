/**
 * 
 */
package p316;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P316A2_Special_Task {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hint = scanner.nextLine();
		scanner.close();

		boolean[] characters = new boolean[10];
		int length = hint.length();

		int countIP = 0, countCharacters = 0;

		for (int i = 0; i < length; i++) {
			char ch = hint.charAt(i);

			if (ch == '?') {
				countIP++;
			} else if (ch >= 'A' && ch <= 'J') {
				characters[ch - 'A'] = true;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (characters[i]) {
				countCharacters++;
			}
		}

		long forChar = 1;

		for (int i = 11 - countCharacters; i <= 10; i++) {
			forChar *= i;
		}

		if (hint.charAt(0) >= 'A' && hint.charAt(0) <= 'J') {
			long subForChar = 1;

			for (int i = 11 - countCharacters; i <= 9; i++) {
				subForChar *= i;
			}

			forChar -= subForChar;
		}

		StringBuilder result = new StringBuilder();

		if (countIP > 0) {
			if (hint.charAt(0) == '?') {
				result.append(String.valueOf(forChar * 9));

				for (int i = 1; i < countIP; i++) {
					result.append('0');
				}
			} else {
				result.append(String.valueOf(forChar));
				
				for (int i = 0; i < countIP; i++) {
					result.append('0');
				}
			}
		} else {
			result.append(String.valueOf(forChar));
		}

		System.out.println(result);
	}
}
