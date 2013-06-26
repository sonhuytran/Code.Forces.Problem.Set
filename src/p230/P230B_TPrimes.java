/**
 * 
 */
package p230;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P230B_TPrimes {

	public static boolean[] primeSieve(int max) {
		if (max == 1) {
			return new boolean[] { false, false };
		}

		boolean[] isPrime = new boolean[max + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		boolean[] isPrime = primeSieve(1000000);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			long number = scanner.nextLong();
			long sqrt = (long) Math.sqrt(number);

			// it must be a square of a prime number
			if (isPrime[(int) sqrt] && sqrt * sqrt == number) {
				result.append("YES\n");
			} else {
				result.append("NO\n");
			}
		}

		scanner.close();
		System.out.println(result.toString().trim());
	}
}
