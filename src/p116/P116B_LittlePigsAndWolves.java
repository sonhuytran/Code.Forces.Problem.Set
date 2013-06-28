package p116;

import java.util.Scanner;

public class P116B_LittlePigsAndWolves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		char[][] grid = new char[n][];

		for (int i = 0; i < n; i++) {
			grid[i] = scanner.nextLine().toCharArray();
		}

		scanner.close();
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 'W') {
					if ((i > 0 && grid[i - 1][j] == 'P')
							|| (i < n - 1 && grid[i + 1][j] == 'P')
							|| (j > 0 && grid[i][j - 1] == 'P')
							|| (j < m - 1 && grid[i][j + 1] == 'P')) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}
