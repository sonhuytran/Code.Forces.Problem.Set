package p242;

import java.util.Scanner;

public class P242B_BigSegment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int firstleft = scanner.nextInt();
		int firstright = scanner.nextInt();
		int result = 1, minleft = firstleft, maxright = firstright, left, right;

		for (int i = 2; i <= n; i++) {
			left = scanner.nextInt();
			right = scanner.nextInt();

			if (left < minleft || right > maxright) {
				result = -1;
			}

			if (left <= minleft) {
				minleft = left;
			}

			if (right >= maxright) {
				maxright = right;
			}

			if (left == minleft && right == maxright) {
				result = i;
			}
		}

		scanner.close();
		System.out.println(result);
	}
}
