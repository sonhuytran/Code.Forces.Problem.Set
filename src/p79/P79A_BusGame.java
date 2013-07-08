package p79;

import java.util.Scanner;

public class P79A_BusGame {

	private static String findWinner(int x, int y) {
		int maxturn = Math.min(x / 2, y / 24);
		x -= maxturn * 2;
		y -= maxturn * 24;

		int turn = 0;
		String hanako = "Hanako", ciel = "Ciel";

		do {
			if (turn == 0) {
				if (x >= 2) {
					if (y < 2) {
						return hanako;
					} else {
						x -= 2;
						y -= 2;
					}
				} else if (x == 1) {
					if (y < 12) {
						return hanako;
					} else {
						x--;
						y -= 12;
					}
				} else {
					if (y < 22) {
						return hanako;
					} else {
						y -= 22;
					}
				}
			} else {
				if (y >= 22) {
					y -= 22;
				} else if (y >= 12) {
					if (x < 1) {
						return ciel;
					} else {
						x--;
						y -= 12;
					}
				} else if (y >= 2) {
					if (x < 2) {
						return ciel;
					} else {
						x -= 2;
						y -= 2;
					}
				} else {
					return ciel;
				}
			}

			turn = 1 - turn;
		} while (true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		System.out.println(findWinner(x, y));
	}
}
