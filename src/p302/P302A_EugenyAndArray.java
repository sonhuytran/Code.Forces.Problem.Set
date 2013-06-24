/**
 * 
 */
package p302;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P302A_EugenyAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		int countOne = 0;

		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() == 1) {
				countOne++;
			}
		}

		int min = Math.min(countOne, n - countOne);
		StringBuilder stringBuilder = new StringBuilder();

		int l, r, length;

		for (int i = 0; i < m; i++) {
			l = scanner.nextInt();
			r = scanner.nextInt();
			length = r - l + 1;

			if (length % 2 == 0 && length / 2 <= min) {
				stringBuilder.append("1\n");
			} else {
				stringBuilder.append("0\n");
			}
		}

		scanner.close();
		System.out.println(stringBuilder);
	}
}
