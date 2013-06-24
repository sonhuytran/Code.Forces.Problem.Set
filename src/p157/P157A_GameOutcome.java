/**
 * 
 */
package p157;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P157A_GameOutcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] sumRow = new int[n];
		int[] sumCol = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int number = scanner.nextInt();
				sumRow[i] += number;
				sumCol[j] += number;
			}
		}

		scanner.close();
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sumCol[j] > sumRow[i]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
