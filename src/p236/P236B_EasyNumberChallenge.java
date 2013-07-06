package p236;

import java.util.Scanner;

public class P236B_EasyNumberChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		int max = a * b * c;
		int[] p = new int[max + 1];

		for (int i = 1; i <= max; i++) {
			for (int j = i; j <= max; j += i) {
				p[j]++;
			}
		}

		long sum = 0;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					sum += p[i * j * k];
					sum %= 1073741824L;
				}
			}
		}

		System.out.println(sum);
	}
}
