/**
 * 
 */
package p222;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P222A_ShooshunsAndSequence {

	private static int stepCount(int n, int k, int[] numbers) {
		for (int i = k + 1; i <= n; i++) {
			if (numbers[i] != numbers[k]) {
				return -1;
			}
		}

		int i = k - 1;

		while (i >= 0 && numbers[i] == numbers[k]) {
			i--;
		}

		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();
		int[] numbers = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		int result = stepCount(n, k, numbers);
		System.out.println(result);
	}
}
