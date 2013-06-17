/**
 * 
 */
package p124;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P124A_TheNumberOfPositions {

	private static int nPositions(int n, int a, int b) {
		// x-1 >= a, n-x <= b
		// x >= max(a+1,n-b)
		int i = Math.max(a + 1, n - b);

		return n - i + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		scanner.close();

		int result = nPositions(n, a, b);
		System.out.println(result);
	}

}
