/**
 * 
 */
package p287;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P287A_IQTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4;
		char[][] sheet = new char[n][n];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();

			for (int j = 0; j < n; j++) {
				sheet[i][j] = line.charAt(j);
			}
		}

		scanner.close();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				int countDiese = 0;
				int countDot = 0;

				for (int i1 = 0; i1 < 2; i1++) {
					for (int j1 = 0; j1 < 2; j1++) {
						if (sheet[i + i1][j + j1] == '.') {
							countDot++;
						} else {
							countDiese++;
						}
					}
				}

				if (countDiese != countDot) {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("NO");
	}
}
