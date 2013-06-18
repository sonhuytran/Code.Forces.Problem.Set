/**
 * 
 */
package p37;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P37A_Towers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		// ArrayList<Integer> bars = new ArrayList<Integer>(n + 1);
		int[] bars = new int[1001];

		for (int i = 0; i < n; i++) {
			int length = scanner.nextInt();
			bars[length]++;
		}

		scanner.close();

		int barCount = 0, maxHeight = Integer.MIN_VALUE;

		for (int i = 1; i <= 1000; i++) {
			if (bars[i] > 0) {
				barCount++;

				if (bars[i] > maxHeight) {
					maxHeight = bars[i];
				}
			}
		}

		System.out.println(maxHeight + " " + barCount);
	}
}
