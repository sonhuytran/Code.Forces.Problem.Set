package p221;

import java.util.Scanner;

public class P221B_LittleElephantAndNumbers {

	private static boolean[] digits(int number) {
		boolean digits[] = new boolean[10];

		while (number > 0) {
			digits[number % 10] = true;
			number /= 10;
		}

		return digits;
	}

	private static boolean hasDigits(boolean[] digits, int number) {
		while (number > 0) {
			if (digits[number % 10]) {
				return true;
			}

			number /= 10;
		}

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();

		boolean[] digitsX = digits(x);
		int max = (int) Math.sqrt(x);
		int count = 0;

		for (int i = 1; i < max; i++) {
			if (x % i == 0) {
				if (hasDigits(digitsX, i)) {
					count++;
				}

				if (hasDigits(digitsX, x / i)) {
					count++;
				}
			}
		}

		if (x % max == 0) {
			if (hasDigits(digitsX, max)) {
				count++;
			}
			
			int temp = x / max;
			
			if (temp != max) {
				if (hasDigits(digitsX, temp)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
