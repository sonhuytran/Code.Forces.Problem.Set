/**
 * 
 */
package p41;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P41A_Translation {

	private static boolean isReverse(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}

		int i = 0, j = string2.length() - 1;

		while (j >= 0) {
			if (string1.charAt(i) != string2.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();

		scanner.close();

		boolean result = isReverse(string1, string2);
		System.out.println(result ? "YES" : "NO");
	}

}
