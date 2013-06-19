/**
 * 
 */
package p129;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P129A_Cookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] bags = new int[n];

		for (int i = 0; i < n; i++) {
			bags[i] = scanner.nextInt();
		}

		scanner.close();

		int countEven = 0, countOdd = 0;

		for (int i = 0; i < n; i++) {
			if (bags[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		int result = countEven;

		if (countOdd % 2 == 1) {
			result = countOdd;
		}

		System.out.println(result);
	}
}
