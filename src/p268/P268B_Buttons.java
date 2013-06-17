/**
 * 
 */
package p268;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P268B_Buttons {

	private static int countButtonPresses(int n) {
		int count = n;

		for (int i = 1; i < n; i++) {
			count += i * (n - i);
		}

		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int result = countButtonPresses(n);
		System.out.println(result);
	}
}
