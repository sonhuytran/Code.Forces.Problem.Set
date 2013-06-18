/**
 * 
 */
package p165;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P165A_SupercentralPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		boolean[] left = new boolean[n];
		boolean[] lower = new boolean[n];
		boolean[] upper = new boolean[n];
		boolean[] right = new boolean[n];

		int countCentral = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (y[i] == y[j]) {
					if (x[i] < x[j]) {
						right[i] = true;
						left[j] = true;
					} else {
						left[i] = true;
						right[j] = true;
					}
				}

				if (x[i] == x[j]) {
					if (y[i] < y[j]) {
						upper[i] = true;
						lower[j] = true;
					} else {
						lower[i] = true;
						upper[j] = true;
					}
				}
			}

			if (left[i] && right[i] && upper[i] && lower[i]) {
				countCentral++;
			}
		}

		int i = n - 1;
		
		if (left[i] && right[i] && upper[i] && lower[i]) {
			countCentral++;
		}

		System.out.println(countCentral);
	}
}
