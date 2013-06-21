/**
 * 
 */
package p317;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P317A_PerfectPair {

	private static long count(long x, long y, long m) {
		long a = Math.min(x, y), b = Math.max(x, y), count = 0;

		if (b >= m) {
			return 0;
		}

		if (b <= 0) {
			return -1;
		}

		if (a <= 0) {
			long temp = (long) Math.ceil((0 - a) * 1.0 / b);
			count += temp;
			a += temp * b;
		}

		while (Math.max(a, b) < m) {
			if (a < b) {
				a += b;
			} else {
				b += a;
			}

			count++;
		}

		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		long m = scanner.nextLong();

		scanner.close();
		System.out.println(count(x, y, m));
	}
}