/**
 * 
 */
package p291;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P291A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();
		int[] ids = new int[n];

		for (int i = 0; i < n; i++) {
			ids[i] = scanner.nextInt();
		}

		scanner.close();

		int countCalls = 0;

		for (int i = 1; i < ids.length; i++) {
			if (ids[i] <= 0) {
				continue;
			}

			int count = 0;

			for (int j = 0; j < i; j++) {
				if (ids[i] == ids[j]) {
					count++;
				}
			}

			if (count > 1) {
				countCalls = -1;
				break;
			} else if (count == 1) {
				countCalls++;
			}
		}

		System.out.println(countCalls);
	}
}
