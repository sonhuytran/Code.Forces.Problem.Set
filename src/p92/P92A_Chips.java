/**
 * 
 */
package p92;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P92A_Chips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		int i = 1;

		while (m >= i) {
			m -= i;
			i++;

			if (i > n) {
				i = 1;
			}
		}

		System.out.println(m);
	}
}
