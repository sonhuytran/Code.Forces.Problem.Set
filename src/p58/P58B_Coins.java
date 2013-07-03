package p58;

import java.util.Scanner;

public class P58B_Coins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		StringBuilder result = new StringBuilder();
		result.append(n);
		result.append(' ');

		int i = 2;

		while (n > 1) {
			while (n % i != 0) {
				i++;
			}

			while (n % i == 0) {
				n /= i;
				result.append(n);
				result.append(' ');
			}
		}

		System.out.println(result.toString().trim());
	}
}
