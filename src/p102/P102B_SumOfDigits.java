package p102;

import java.util.Scanner;

public class P102B_SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();

		if (number.length() < 2) {
			System.out.println("0");
			return;
		}

		int sum = 0, count = 1, numeric = 0;

		for (int i = 0; i < number.length(); i++) {
			sum += Character.getNumericValue(number.charAt(i));

		}

		while (sum >= 10) {
			numeric = sum;
			sum = 0;

			while (numeric > 0) {
				sum += numeric % 10;
				numeric /= 10;
			}

			count++;
		}

		System.out.println(count);
	}
}
