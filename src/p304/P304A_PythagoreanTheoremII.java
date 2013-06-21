/**
 * 
 */
package p304;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P304A_PythagoreanTheoremII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int count = 0;

		for (int a = 1; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				int temp = a * a + b * b;
				int c = (int) (Math.sqrt(temp));

				if (c <= n && c * c == temp) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
