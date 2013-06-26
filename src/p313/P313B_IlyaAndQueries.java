package p313;

import java.util.Scanner;

public class P313B_IlyaAndQueries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();

		int length = input.length - 1;
		boolean[] queries = new boolean[length];

		for (int i = 0; i < length; i++) {
			queries[i] = input[i] == input[i + 1];
		}

		int n = scanner.nextInt(), left = 0, right = 0;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			left = scanner.nextInt() - 1;
			right = scanner.nextInt() - 1;
			int count = 0;

			for (int j = left; j < right; j++) {
				if (queries[j]) {
					count++;
				}
			}

			result.append(count);
			result.append('\n');
		}

		scanner.close();
		System.out.println(result.toString().trim());
	}
}