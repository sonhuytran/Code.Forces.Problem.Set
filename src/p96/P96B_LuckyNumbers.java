package p96;

import java.util.Scanner;

public class P96B_LuckyNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int ndigits = 0, temp = n;

		while (temp > 0) {
			ndigits++;
			temp /= 10;
		}

		if (ndigits % 2 > 0) {
			ndigits = (ndigits + 1) / 2;
			long result = 0;

			for (int i = 0; i < ndigits; i++) {
				result = result * 10 + 4;
			}

			for (int i = 0; i < ndigits; i++) {
				result = result * 10 + 7;
			}

			System.out.println(result);
			return;
		}

		ndigits /= 2;
		long max = 0;

		for (int i = 0; i < ndigits; i++) {
			max = max * 10 + 7;
		}

		for (int i = 0; i < ndigits; i++) {
			max = max * 10 + 4;
		}

		if (n > max) {
			ndigits++;
			long result = 0;

			for (int i = 0; i < ndigits; i++) {
				result = result * 10 + 4;
			}

			for (int i = 0; i < ndigits; i++) {
				result = result * 10 + 7;
			}

			System.out.println(result);
			return;
		}

		int length = ndigits * 2;
		byte[] digits = new byte[length];

		for (int i = 0; i < ndigits; i++) {
			digits[i] = 4;
			digits[i + ndigits] = 7;
		}

		long result;

		while ((result = getNumber(digits)) < n) {
			next(digits);
		}

		System.out.println(result);
	}

	private static long getNumber(byte[] digits) {
		long result = 0;

		for (int i = 0; i < digits.length; i++) {
			result = result * 10 + digits[i];
		}

		return result;
	}

	private static void next(byte[] digits) {
		int index = digits.length - 2;

		while (index >= 0 && digits[index] >= digits[index + 1]) {
			index--;
		}

		if (index < 0) {
			return;
		}

		int i = digits.length - 1;

		while (digits[i] <= digits[index]) {
			i--;
		}

		byte temp = digits[i];
		digits[i] = digits[index];
		digits[index] = temp;

		int low = index + 1, high = digits.length - 1;

		while (low < high) {
			temp = digits[low];
			digits[low] = digits[high];
			digits[high] = temp;
			low++;
			high--;
		}
	}
}
