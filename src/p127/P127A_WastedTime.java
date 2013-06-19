/**
 * 
 */
package p127;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P127A_WastedTime {

	private static double distance(int x1, int y1, int x2, int y2) {
		int dx = x2 - x1;
		int dy = y2 - y1;

		return Math.sqrt(dx * dx + dy * dy);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		double path = 0;

		for (int i = 1; i < n; i++) {
			path += distance(x[i], y[i], x[i - 1], y[i - 1]);
		}

		path *= k;

		double velocity = 50;
		double wasted = path / velocity;

		System.out.println(wasted);
	}
}
