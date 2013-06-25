package p257;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P257A_Sockets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();

		ArrayList<Integer> plugs = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			plugs.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(plugs, Collections.reverseOrder());

		int sumSockets = k;
		int nPlugs = 0;

		while (sumSockets < m && nPlugs < n) {
			sumSockets += plugs.get(nPlugs) - 1;
			nPlugs++;
		}

		if (sumSockets < m) {
			System.out.println(-1);
		} else {
			System.out.println(nPlugs);
		}
	}
}
