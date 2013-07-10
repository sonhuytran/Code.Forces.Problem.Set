package p181;

import java.util.Scanner;

public class P181A_SeriesOfCrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		@SuppressWarnings("unused")
		int m = scanner.nextInt();

		String input = "";
		int[] x = new int[4], y = new int[4];
		int index = 0, indexStar;

		for (int i = 0; i < n; i++) {
			input = scanner.next();
			indexStar = input.indexOf('*');

			while (indexStar > -1) {
				x[index] = i;
				y[index] = indexStar;
				index++;

				indexStar = input.indexOf('*', indexStar + 1);
			}
		}

		scanner.close();

		if (x[0] == x[1]) {
			x[3] = x[2];
		} else if (x[0] == x[2]) {
			x[3] = x[1];
		} else {
			x[3] = x[0];
		}

		if (y[0] == y[1]) {
			y[3] = y[2];
		} else if (y[0] == y[2]) {
			y[3] = y[1];
		} else {
			y[3] = y[0];
		}

		System.out.println((x[3] + 1) + " " + (y[3] + 1));
	}
}
