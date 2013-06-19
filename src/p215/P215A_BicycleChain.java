/**
 * 
 */
package p215;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P215A_BicycleChain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();
		scanner.nextLine();

		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
		}

		scanner.close();

		ArrayList<Integer> integerGears = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (b[j] % a[i] == 0) {
					integerGears.add(b[j] / a[i]);
				}
			}
		}

		int max = -1;

		for (int i = 0; i < integerGears.size(); i++) {
			int gear = integerGears.get(i);

			if (gear > max) {
				max = gear;
			}
		}

		int countMax = 0;

		for (int i = 0; i < integerGears.size(); i++) {
			if (integerGears.get(i) == max) {
				countMax++;
			}
		}
		
		System.out.println(countMax);
	}
}
