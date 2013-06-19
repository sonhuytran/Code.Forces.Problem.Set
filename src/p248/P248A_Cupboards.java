/**
 * 
 */
package p248;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P248A_Cupboards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		byte[] left = new byte[n];
		byte[] right = new byte[n];

		for (int i = 0; i < n; i++) {
			left[i] = scanner.nextByte();
			right[i] = scanner.nextByte();
			scanner.nextLine();
		}

		scanner.close();

		int closeLeft = 0, closeRight = 0;

		for (int i = 0; i < n; i++) {
			if (left[i] == 0) {
				closeLeft++;
			}

			if (right[i] == 0) {
				closeRight++;
			}
		}

		int minLeft = Math.min(closeLeft, n - closeLeft);
		int minRight = Math.min(closeRight, n - closeRight);
		int result = minLeft + minRight;
		
		System.out.println(result);
	}
}
