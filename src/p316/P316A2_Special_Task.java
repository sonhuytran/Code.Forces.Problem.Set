/**
 * 
 */
package p316;

import java.math.BigInteger;
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

		BigInteger forIP = BigInteger.valueOf(1);

		if (countIP > 0) {
			if (hint.charAt(0) == '?') {
				forIP = BigInteger.valueOf(10).pow(countIP - 1)
						.multiply(BigInteger.valueOf(9));
			} else {
				forIP = BigInteger.valueOf(10).pow(countIP);
			}
		}

		BigInteger forChar = BigInteger.valueOf(1);

		for (int i = 11 - countCharacters; i <= 10; i++) {
			forChar = forChar.multiply(BigInteger.valueOf(i));
		}

		if (hint.charAt(0) >= 'A' && hint.charAt(0) <= 'J') {
			BigInteger subForChar = BigInteger.valueOf(1);

			for (int i = 11 - countCharacters; i <= 9; i++) {
				subForChar = subForChar.multiply(BigInteger.valueOf(i));
			}

			forChar = forChar.subtract(subForChar);
		}

		BigInteger result = forIP.multiply(forChar);
		System.out.println(result);
	}
}
