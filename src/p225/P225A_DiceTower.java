/**
 * 
 */
package p225;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P225A_DiceTower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int top = scanner.nextInt();
		int[] left = new int[n];
		int[] right = new int[n];

		for (int i = 0; i < n; i++) {
			left[i] = scanner.nextInt();
			right[i] = scanner.nextInt();
		}

		scanner.close();

		// check the first dice
		int bottom = 7 - top;

		if (bottom == left[0] || bottom == right[0] || top == left[0]
				|| top == right[0]) {
			System.out.println("NO");
			return;
		}

		for (int i = 1; i < n; i++) {
			int newTop = 21 - left[i] - right[i] - (7 - left[i])
					- (7 - right[i]) - bottom;
			int newBottom = 7 - newTop;

			if (newBottom == left[i] || newBottom == right[i]
					|| newTop == left[i] || newTop == right[i]
					|| newTop == bottom) {
				System.out.println("NO");
				return;
			}

			top = newTop;
			bottom = newBottom;
		}

		System.out.println("YES");
	}
}
