/**
 * 
 */
package p80;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P80A {

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		int max = (int) Math.sqrt(number);

		for (int i = 2; i <= max; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean isNextPrime(int n, int m) {
		if (!isPrime(m)) {
			return false;
		}

		for (int i = n + 1; i < m; i++) {
			if (isPrime(i)) {
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
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		boolean result = isNextPrime(n, m);
		System.out.println(result ? "YES" : "NO");
	}
}
