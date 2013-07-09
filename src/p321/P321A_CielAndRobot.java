package p321;

import java.util.Scanner;

public class P321A_CielAndRobot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String command = scanner.next();
		int length = command.length();
		scanner.close();

		int[] x = new int[length + 1], y = new int[length + 1];
		int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;

		for (int i = 1; i < command.length(); i++) {
			switch (command.charAt(i)) {
			case 'U':
				x[i] = x[i - 1];
				y[i] = y[i - 1] + 1;
				break;

			case 'D':
				x[i] = x[i - 1];
				y[i] = y[i - 1] - 1;
				break;

			case 'L':
				x[i] = x[i - 1] - 1;
				y[i] = y[i - 1];
				break;

			case 'R':
				x[i] = x[i - 1] + 1;
				y[i] = y[i - 1];

			default:
				break;
			}

			maxX = Math.max(maxX, x[i]);
			maxY = Math.max(maxY, y[i]);
			minX = Math.min(minX, x[i]);
			minY = Math.min(minY, y[i]);
		}

		if ((a >= minX && a <= maxX) || (b >= minY && b <= maxY)) {
			for (int i = 0; i <= length; i++) {
				if (a == x[i] && b == y[i]) {
					System.out.println("Yes");
					return;
				}
			}

			System.out.println("No");
			return;
		}
	}
}
