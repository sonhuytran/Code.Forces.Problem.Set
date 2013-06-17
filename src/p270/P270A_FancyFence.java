/**
 * 
 */
package p270;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P270A_FancyFence {

	private static void test(int angle) {
		boolean divisible = (360 % (180 - angle) == 0);
		System.out.println(divisible ? "YES" : "NO");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nTests = scanner.nextInt();
		scanner.nextLine();

		int[] tests = new int[nTests];

		for (int i = 0; i < nTests; i++) {
			tests[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		for (int i = 0; i < nTests; i++) {
			test(tests[i]);
		}
	}
}
