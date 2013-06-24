package p239;

import java.util.Scanner;

public class P239_TwoBagsOfPotatoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		int sum = y + 1;

		if (sum % k != 0) {
			sum = ((sum / k) + 1) * k;
		}

		if (sum > n) {
			System.out.println(-1);
			return;
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int x = 0; sum <= n; sum += k) {
			x = sum - y;
			stringBuilder.append(x);
			stringBuilder.append(" ");
		}

		System.out.println(stringBuilder);
	}
}
