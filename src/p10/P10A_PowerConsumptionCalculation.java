/**
 * 
 */
package p10;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P10A_PowerConsumptionCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int p3 = scanner.nextInt();
		int t1 = scanner.nextInt();
		int t2 = scanner.nextInt();
		scanner.nextLine();

		int[] l = new int[n];
		int[] r = new int[n];

		for (int i = 0; i < r.length; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		int consumption = 0;

		for (int i = 0; i < n; i++) {
			consumption += (r[i] - l[i]) * p1;
		}

		for (int i = 1; i < n; i++) {
			int t = l[i] - r[i - 1];

			if (t <= t1) {
				consumption += t * p1;
			} else {
				consumption += t1 * p1;
				t -= t1;

				if (t <= t2) {
					consumption += t * p2;
				} else {
					consumption += t2 * p2 + (t - t2) * p3;
				}
			}
		}

		System.out.println(consumption);
	}
}
