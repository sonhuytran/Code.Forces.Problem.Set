/**
 * 
 */
package p262;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P262A_RomaAndLuckyNumbers {

	private static int countLuckyDigits(long number) {
		int count = 0;

		while (number > 0) {
			long digit = number % 10;

			if (digit == 4 || digit == 7) {
				count++;
			}

			number /= 10;
		}

		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long[] numbers = new long[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextLong();
		}

		scanner.close();

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (countLuckyDigits(numbers[i]) <= k) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
