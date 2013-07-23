package p298;

import java.util.Scanner;

public class P298B_Sail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int ex = scanner.nextInt();
		int ey = scanner.nextInt();
		scanner.nextLine();
		String wind = scanner.nextLine();
		scanner.close();

		int minx, miny;
		int dx, dy, index;

		if (ex >= sx) {
			dx = ex - sx;
			index = 0;

			while (index < t && dx > 0) {
				if (wind.charAt(index) == 'E') {
					dx--;
				}

				index++;
			}

			if (dx > 0) {
				System.out.println(-1);
				return;
			}

			minx = index - 1;
		} else {
			dx = sx - ex;
			index = 0;

			while (index < t && dx > 0) {
				if (wind.charAt(index) == 'W') {
					dx--;
				}

				index++;
			}

			if (dx > 0) {
				System.out.println(-1);
				return;
			}

			minx = index - 1;
		}

		if (ey >= sy) {
			dy = ey - sy;
			index = 0;

			while (index < t && dy > 0) {
				if (wind.charAt(index) == 'N') {
					dy--;
				}

				index++;
			}

			if (dy > 0) {
				System.out.println(-1);
				return;
			}

			miny = index - 1;
		} else {
			dy = sy - ey;
			index = 0;

			while (index < t && dy > 0) {
				if (wind.charAt(index) == 'S') {
					dy--;
				}

				index++;
			}

			if (dy > 0) {
				System.out.println(-1);
				return;
			}

			miny = index - 1;
		}

		System.out.println(Math.max(minx, miny) + 1);
	}
}
