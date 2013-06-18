/**
 * 
 */
package p272;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P272A_DimaAndFriends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] fingers = new int[n];

		for (int i = 0; i < n; i++) {
			fingers[i] = scanner.nextInt();
		}

		scanner.close();

		int nPerson = n + 1;
		int finger = 0;

		for (int i = 0; i < n; i++) {
			finger = finger + fingers[i] % nPerson;
		}

		int wayCount = 0;

		for (int i = 1; i <= 5; i++) {
			if (((finger + i) % nPerson) != 1) {
				wayCount++;
			}
		}

		System.out.println(wayCount);
	}

}
