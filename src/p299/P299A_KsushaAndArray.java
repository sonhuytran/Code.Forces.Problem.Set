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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		scanner.close();
		int result = min;

		for (int i = 0; i < n; i++) {
			if (numbers[i] % min != 0) {
				result = -1;
				break;
			}
		}

		System.out.println(result);
	}
}
