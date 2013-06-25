package p289;

import java.util.Scanner;

public class P289A_PoloThePenguinAndSegments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] left = new int[n];
		int[] right = new int[n];

		long size = 0;

		for (int i = 0; i < n; i++) {
			left[i] = scanner.nextInt();
			right[i] = scanner.nextInt();
			size += (right[i] - left[i] + 1);
		}

		scanner.close();

		if (size % k == 0) {
			System.out.println(0);
		} else {
			System.out.println(k - size % k);
		}
	}
}
