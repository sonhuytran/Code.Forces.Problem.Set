package p106;

import java.util.Scanner;

public class P106B_ChoosingLaptop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] params = new int[n][4];
		boolean[] outdateds = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				params[i][j] = scanner.nextInt();
			}

			for (int j = 0; j < i; j++) {
				if (outdateds[j]) {
					continue;
				}

				boolean outdatedi = true, outdatedj = true;

				for (int k = 0; k < 4; k++) {
					if (params[i][k] >= params[j][k]) {
						outdatedi = false;
					}

					if (params[j][k] >= params[i][k]) {
						outdatedj = false;
					}
				}

				if (outdatedj) {
					outdateds[j] = true;
				}

				if (outdatedi) {
					outdateds[i] = true;
					break;
				}
			}
		}

		scanner.close();

		int cheapestPrice = Integer.MAX_VALUE;
		int cheapestIndex = -1;

		for (int i = 0; i < n; i++) {
			if (!outdateds[i]) {
				if (params[i][3] < cheapestPrice) {
					cheapestPrice = params[i][3];
					cheapestIndex = i;
				}
			}
		}

		System.out.println(cheapestIndex + 1);
	}
}
