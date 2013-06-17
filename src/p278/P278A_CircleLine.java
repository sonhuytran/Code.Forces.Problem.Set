/**
 * 
 */
package p278;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P278A_CircleLine {

	private static int downPathLength(int[] distances, int n, int s, int t) {
		int length = 0;

		int i = s;

		while (i != t) {
			length += distances[i];
			i = (i + 1) % n;
		}

		return length;
	}

	private static int upPathLength(int[] distances, int n, int s, int t) {
		int length = 0;

		int i = s;

		while (i != t) {
			i = (i - 1);

			if (i < 0) {
				i += n;
			}

			length += distances[i];
		}

		return length;
	}

	private static int shortestPathLength(int[] distances, int n, int s, int t) {
		int d = downPathLength(distances, n, s, t);
		int u = upPathLength(distances, n, s, t);

		return Math.min(d, u);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] distances = new int[n];

		for (int i = 0; i < n; i++) {
			distances[i] = scanner.nextInt();
		}

		scanner.nextLine();

		int s = scanner.nextInt();
		int t = scanner.nextInt();

		scanner.close();

		int result = shortestPathLength(distances, n, s - 1, t - 1);
		System.out.println(result);
	}

}
