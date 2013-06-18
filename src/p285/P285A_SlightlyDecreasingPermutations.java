/**
 * 
 */
package p285;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P285A_SlightlyDecreasingPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		scanner.close();

		int[] permutation = new int[n];

		for (int i = 0; i < k; i++) {
			permutation[i] = n - i;
		}

		for (int i = k; i < n; i++) {
			permutation[i] = i - k + 1;
		}

		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			stringBuilder.append(permutation[i]);
			stringBuilder.append(" ");
		}
		
		System.out.println(stringBuilder.toString().trim());
	}
}