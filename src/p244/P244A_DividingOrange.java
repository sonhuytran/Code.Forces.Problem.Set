/**
 * 
 */
package p244;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P244A_DividingOrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[][] dividings = new int[k][n];
		int orangeCount = n * k;
		boolean[] oranges = new boolean[orangeCount + 1];

		for (int i = 0; i < k; i++) {
			int number = scanner.nextInt();
			dividings[i][0] = number;
			oranges[number] = true;
		}

		scanner.close();
		int index = 1;

		for (int i = 0; i < k; i++) {
			for (int j = 1; j < n; j++) {
				while (index <= orangeCount && oranges[index]) {
					index++;
				}

				dividings[i][j] = index;
				oranges[index] = true;
			}
		}

		for (int i = 0; i < k; i++) {
			StringBuilder stringBuilder = new StringBuilder();

			for (int j = 0; j < n; j++) {
				stringBuilder.append(dividings[i][j]);
				stringBuilder.append(" ");
			}
			
			System.out.println(stringBuilder);
		}
	}
}
