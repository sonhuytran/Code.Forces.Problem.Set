/**
 * 
 */
package p13;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P13A_Numbers {

	private static int sumDigits(int base10, int base) {
		int sumDigit = 0;

		while (base10 > 0) {
			int temp = base10 % base;
			sumDigit += temp;
			base10 /= base;
		}

		return sumDigit;
	}

	private static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();

		int sumDigits = 0;

		for (int i = 2; i < a; i++) {
			sumDigits += sumDigits(a, i);
		}

		int numerator = sumDigits;
		int denominator = a - 2;
		int gcd = greatestCommonDivisor(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;

		System.out.println(numerator + "/" + denominator);
	}
}
