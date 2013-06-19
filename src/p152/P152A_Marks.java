/**
 * 
 */
package p152;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P152A_Marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		int[][] marks = new int[n][m];

		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();

			for (int j = 0; j < m; j++) {
				marks[i][j] = line.charAt(j) - '0';
			}
		}

		scanner.close();

		int[] maxSubjects = new int[m];

		for (int j = 0; j < m; j++) {
			int max = -1;

			for (int i = 0; i < n; i++) {
				if (marks[i][j] > max) {
					max = marks[i][j];
				}
			}

			maxSubjects[j] = max;
		}

		int countSuccessful = 0;

		for (int i = 0; i < n; i++) {
			boolean successful = false;

			for (int j = 0; j < m; j++) {
				if (marks[i][j] == maxSubjects[j]) {
					successful = true;
					break;
				}
			}

			if (successful) {
				countSuccessful++;
			}
		}

		System.out.println(countSuccessful);
	}
}
