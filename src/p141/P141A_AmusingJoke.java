/**
 * 
 */
package p141;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P141A_AmusingJoke {

	private static boolean isPermutations(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}

		int[] characterCount = new int[26];

		for (int i = 0; i < string1.length(); i++) {
			char ch1 = string1.charAt(i);
			char ch2 = string2.charAt(i);

			characterCount[ch1 - 'A']++;
			characterCount[ch2 - 'A']--;
		}

		for (int i = 0; i < 26; i++) {
			if (characterCount[i] != 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String guest = scanner.nextLine();
		String host = scanner.nextLine();
		String pile = scanner.nextLine();

		scanner.close();

		boolean result = isPermutations(guest.concat(host), pile);
		System.out.println(result ? "YES" : "NO");
	}

}
