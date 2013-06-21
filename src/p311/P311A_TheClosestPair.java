/**
 * 
 */
package p311;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P311A_TheClosestPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();

		int max = (n) * (n - 1) / 2;

		if (k >= max) {
			System.out.println("no solution");
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.println("0 " + i);
		}
	}
}