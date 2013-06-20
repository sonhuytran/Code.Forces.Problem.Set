/**
 * 
 */
package p11;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P11A_IncreasingSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		int stepCount = 0;

		for (int i = 1; i < n; i++) {
			if (numbers[i] > numbers[i - 1]) {
				continue;
			}

			int current = numbers[i];
			int min = numbers[i - 1] + 1;
			int step = (int) Math.ceil((min - current) * 1.0 / d);
			stepCount += step;

			numbers[i] = current + step * d;
		}

		System.out.println(stepCount);
	}
}
