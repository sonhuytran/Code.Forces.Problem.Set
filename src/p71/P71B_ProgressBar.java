package p71;

import java.util.Scanner;

public class P71B_ProgressBar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt(), t = scanner.nextInt();
		scanner.close();

		t = n * k * t / 100;
		int i = t / k, j = t % k, l = (j == 0) ? (n - i) : (n - i - 1);
		char space = ' ';
		StringBuilder result = new StringBuilder();

		while (i > 0) {
			result.append(k);
			result.append(space);
			i--;
		}

		if (j > 0) {
			result.append(j);
			result.append(space);
		}

		while (l > 0) {
			result.append(0);
			result.append(space);
			l--;
		}

		System.out.println(result.toString().trim());
	}
}
