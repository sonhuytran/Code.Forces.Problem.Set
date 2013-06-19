/**
 * 
 */
package p139;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P139A_PetrAndBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] pagesRead = new int[8];
		int sumWeek = 0;

		for (int i = 1; i <= 7; i++) {
			pagesRead[i] = scanner.nextInt();
			sumWeek += pagesRead[i];
		}

		scanner.close();

		n %= sumWeek;
		int currentDay = 1;

		if (n == 0) {
			currentDay = 7;
			
			while (pagesRead[currentDay] == 0) {
				currentDay--;
			}
		} else {
			while (n > 0) {
				if (n > pagesRead[currentDay]) {
					n -= pagesRead[currentDay];
					currentDay++;
				} else {
					n = 0;
				}
			}
		}

		System.out.println(currentDay);
	}
}
