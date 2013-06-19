/**
 * 
 */
package p59;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P59A_Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		int countUpper = 0, countLower = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isUpperCase(ch)) {
				countUpper++;
			} else {
				countLower++;
			}
		}

		String result = "";

		if (countLower >= countUpper) {
			result = input.toLowerCase();
		} else {
			result = input.toUpperCase();
		}

		System.out.println(result);
	}
}
