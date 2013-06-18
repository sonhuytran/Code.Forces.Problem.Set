/**
 * 
 */
package p275;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P275A_LightsOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] presses = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				presses[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		int[][] lights = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int countToggles = presses[i][j];

				if (i > 0) {
					countToggles += presses[i - 1][j];
				}

				if (i < 2) {
					countToggles += presses[i + 1][j];
				}

				if (j > 0) {
					countToggles += presses[i][j - 1];
				}

				if (j < 2) {
					countToggles += presses[i][j + 1];
				}

				lights[i][j] = 1 - (countToggles % 2);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(lights[i][j]);
			}

			System.out.println();
		}
	}
}
