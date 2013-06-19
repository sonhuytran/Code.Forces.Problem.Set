/**
 * 
 */
package p200;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P200B_Drinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}

		scanner.close();

		int percentage = 0;

		for (int i = 0; i < n; i++) {
			percentage += p[i];
		}

		double percentagef = percentage * 1.0 / n;

		System.out.println(percentagef);
	}
}
