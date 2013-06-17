/**
 * 
 */
package p276;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P276A_LunchRush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nRestos = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();

		int[] f = new int[nRestos];
		int[] t = new int[nRestos];

		for (int i = 0; i < nRestos; i++) {
			f[i] = scanner.nextInt();
			t[i] = scanner.nextInt();
		}

		scanner.close();

		int joymax = Integer.MIN_VALUE;

		for (int i = 0; i < nRestos; i++) {
			int joyi = Integer.MIN_VALUE;

			if (t[i] <= k) {
				joyi = f[i];
			} else {
				joyi = f[i] - (t[i] - k);
			}

			if (joyi > joymax) {
				joymax = joyi;
			}
		}

		System.out.println(joymax);
	}

}
