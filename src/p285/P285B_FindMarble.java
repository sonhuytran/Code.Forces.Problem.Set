package p285;

import java.util.Scanner;

public class P285B_FindMarble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int t = scanner.nextInt();
		int[] moves = new int[n + 1];
		boolean[] visited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			moves[i] = scanner.nextInt();
		}

		scanner.close();

		if (s == t) {
			System.out.println(0);
			return;
		}

		int pos = s, moved = 0;

		do {
			moved++;
			visited[pos] = true;
			pos = moves[pos];
		} while (pos != t && !visited[pos]);

		if (pos != t) {
			System.out.println(-1);
		} else {
			System.out.println(moved);
		}
	}
}
