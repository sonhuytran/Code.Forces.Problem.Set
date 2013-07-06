package p284;

import java.util.Scanner;

public class P284A_CowsAndPrimitiveRoots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p = scanner.nextInt();
		scanner.close();

		int count = 0, temp = 0, max = 0, pow = 0;
		
		if (p == 2) {
			System.out.println(1);
			return;
		}

		for (int x = 2; x < p; x++) {
			max = p - 1;
			temp = 1;

			for (pow = 1; pow < max; pow++) {
				temp *= x;
				temp %= p;

				if ((temp - 1) % p == 0) {
					break;
				}
			}

			if (pow == max) {
				temp *= x;
				temp %= p;

				if ((temp - 1) % p == 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
