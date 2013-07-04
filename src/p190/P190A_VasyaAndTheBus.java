package p190;

import java.util.Scanner;

public class P190A_VasyaAndTheBus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		if (n <= 0 && m > 0) {
			System.out.println("Impossible");
			return;
		}

		int min = n;

		if (m > n) {
			min += (m - n);
		}

		int max = n;

		if (m > 0) {
			max += m - 1;
		}
		
		System.out.println(min + " " + max);
	}
}
