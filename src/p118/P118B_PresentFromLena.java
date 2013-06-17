/**
 * 
 */
package p118;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P118B_PresentFromLena {

	private static void printHankerchief(int n) {
		int nSpaces = 2 * n;
		String[] handkerchief = new String[n + 1];

		for (int i = 0; i <= n; i++, nSpaces -= 2) {
			StringBuilder stringBuilder = new StringBuilder();

			for (int j = 0; j < nSpaces; j++) {
				stringBuilder.append(" ");
			}

			for (int j = 0; j < i; j++) {
				stringBuilder.append(j);
				stringBuilder.append(" ");
			}

			stringBuilder.append(i);

			for (int j = i - 1; j >= 0; j--) {
				stringBuilder.append(" ");
				stringBuilder.append(j);
			}

			handkerchief[i] = stringBuilder.toString();
		}

		for (int i = 0; i <= n; i++) {
			System.out.println(handkerchief[i]);
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.println(handkerchief[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		printHankerchief(n);
	}

}
