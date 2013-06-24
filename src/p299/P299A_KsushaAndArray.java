/**
 * 
 */
package p299;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P299A_KsushaAndArray {
	private static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];

		numbers[0] = scanner.nextInt();
		int gcd = numbers[0];

		for (int i = 1; i < n; i++) {
			numbers[i] = scanner.nextInt();

			if (gcd > 1) {
				gcd = greatestCommonDivisor(gcd, numbers[i]);
			}
		}

		scanner.close();
		int result = -1;

		for (int i = 0; i < n; i++) {
			if (gcd % numbers[i] == 0) {
				result = numbers[i];
				break;
			}
		}

		System.out.println(result);
	}
}
