/**
 * 
 */
package p318;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P318A_EvenOdds {

	private static long find(long n, long k) {
		long nEvens = n / 2;
		long nOdds = n - nEvens;

		if (k <= nOdds) {
			return 2 * k - 1;
		}

		return 2 * (k - nOdds);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		long n = scanner.nextLong();
		long k = scanner.nextLong();

		scanner.close();
		System.out.println(find(n, k));
	}
}
