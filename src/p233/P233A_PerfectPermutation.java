/**
 * 
 */
package p233;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P233A_PerfectPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		if (n % 2 != 0) {
			System.out.println(-1);
			return;
		}

		int[] permutation = new int[n];

		for (int i = 0; i < n; i += 2) {
			permutation[i] = i + 2;
			permutation[i + 1] = i + 1;
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < n; i++) {
			stringBuilder.append(permutation[i]);
			stringBuilder.append(" ");
		}

		System.out.println(stringBuilder.toString().trim());
	}
}
