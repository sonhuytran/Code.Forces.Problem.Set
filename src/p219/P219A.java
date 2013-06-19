/**
 * 
 */
package p219;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P219A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int k = scanner.nextInt();
		scanner.nextLine();

		String string = scanner.nextLine();

		scanner.close();

		int[] alphabetAppearances = new int[26];

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			alphabetAppearances[ch - 'a']++;
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 26; i++) {
			int appearances = alphabetAppearances[i];
			char ch = (char) ('a' + i);

			if (appearances % k == 0) {
				int times = appearances / k;

				for (int j = 0; j < times; j++) {
					stringBuilder.append(ch);
				}
			} else {
				System.out.println(-1);
				return;
			}
		}

		String current = stringBuilder.toString();

		for (int i = 1; i < k; i++) {
			stringBuilder.append(current);
		}

		System.out.println(stringBuilder.toString());
	}
}
