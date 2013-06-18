/**
 * 
 */
package p214;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P214A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		scanner.close();

		int count = 0;

		if (n < m) {
			int a = 0, aa = a * a;

			while (aa <= n) {
				int b = n - aa;

				if (b * b + a == m) {
					count++;
				}

				a++;
				aa = a * a;
			}
		} else {
			int b = 0, bb = b * b;

			while (bb <= m) {
				int a = m - bb;

				if (a * a + b == n) {
					count++;
				}

				b++;
				bb = b * b;
			}
		}

		System.out.println(count);
	}

}
