package p325;

import java.util.Scanner;

public class P325A_SquareAndRectangles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int[][] rects = new int[n][4];

		for (int i = 0; i < n; i++) {
			rects[i][0] = scanner.nextInt();
			rects[i][1] = scanner.nextInt();
			rects[i][2] = scanner.nextInt();
			rects[i][3] = scanner.nextInt();
		}

		scanner.close();
		int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (rects[i][0] < minx) {
				minx = rects[i][0];
			}

			if (rects[i][2] < minx) {
				minx = rects[i][2];
			}

			if (rects[i][1] < miny) {
				miny = rects[i][1];
			}

			if (rects[i][3] < miny) {
				miny = rects[i][3];
			}

			if (rects[i][0] > maxx) {
				maxx = rects[i][0];
			}

			if (rects[i][2] > maxx) {
				maxx = rects[i][2];
			}

			if (rects[i][1] > maxy) {
				maxy = rects[i][1];
			}

			if (rects[i][3] > maxy) {
				maxy = rects[i][3];
			}
		}

		if (maxy - miny == maxx - minx) {
			long areas = (maxy - miny) * (maxx - minx);

			for (int i = 0; i < n; i++) {
				areas -= Math.abs(rects[i][2] - rects[i][0])
						* Math.abs(rects[i][3] - rects[i][1]);
			}
			
			if (areas == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}
}
