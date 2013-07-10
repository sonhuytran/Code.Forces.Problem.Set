package p322;

import java.util.Scanner;

public class P322A_CielAndDancing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		scanner.close();

		int count = 0;
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 1; i <= m; i++) {
			stringBuilder.append(String.format("1 %d\n", i));
			count++;
		}

		for (int i = 2; i <= n; i++) {
			stringBuilder.append(String.format("%d 1\n", i));
			count++;
		}

		stringBuilder.insert(0, count + "\n");
		System.out.println(stringBuilder);
	}
}
