/**
 * 
 */
package p314;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P314A_SerejaAndContest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();

		long[] ratings = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			ratings[i] = scanner.nextLong();
		}

		scanner.close();

		long left = 0;
		int removed = 0;

		for (int i = 2; i <= n; i++) {
			left += ratings[i - 1] * (i - 2 - removed);
			long change = left - ratings[i] * (n - i) * (i - removed - 1);

			if (change < k) {
				removed++;
				left -= ratings[i] * (i - 1 - removed);
				System.out.println(i);
			}
		}
	}
}
