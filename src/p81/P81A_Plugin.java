/**
 * 
 */
package p81;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P81A_Plugin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		char[] characters = new char[input.length()];

		int index = 0;

		for (int i = 0; i < input.length(); i++) {
			if (index == 0 || (characters[index - 1] != input.charAt(i))) {
				characters[index] = input.charAt(i);
				index++;
			} else {
				index--;
			}
		}

		System.out.print(String.valueOf(characters).substring(0, index));
	}
}
