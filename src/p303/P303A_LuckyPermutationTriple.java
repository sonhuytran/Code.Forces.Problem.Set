/**
 * 
 */
package p303;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P303A_LuckyPermutationTriple {

	private static String printArray(int[] numbers) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < numbers.length; i++) {
			stringBuilder.append(numbers[i]);
			stringBuilder.append(" ");
		}

		return stringBuilder.toString().trim();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		if (n % 2 == 0) {
			System.out.println(-1);
			return;
		}

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = i;
		}

		String toString = printArray(numbers);

		for (int i = 0; i < n; i++) {
			numbers[i] = numbers[i] * 2 % n;
		}

		String toString2 = printArray(numbers);

		System.out.println(toString);
		System.out.println(toString);
		System.out.println(toString2);
	}
}
