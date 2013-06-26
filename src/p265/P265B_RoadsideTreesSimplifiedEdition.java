package p265;

import java.util.Scanner;

public class P265B_RoadsideTreesSimplifiedEdition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long currentHeight = scanner.nextLong();
		long count = currentHeight + 1;

		for (int i = 1; i < n; i++) {
			long nextHeight = scanner.nextLong();
			count += Math.abs(nextHeight - currentHeight) + 2;
			currentHeight = nextHeight;
		}

		scanner.close();
		System.out.println(count);
	}
}