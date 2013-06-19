/**
 * 
 */
package p313;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P313A_IlyaAndBankAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		long input = scanner.nextLong();

		scanner.close();

		if (input >= 0) {
			System.out.println(input);
			return;
		}

		input = -input;
		long temp = input % 100;
		input /= 100;

		long last = temp % 10;
		long before = temp / 10;

		input = input * 10 + Math.min(last, before);
		input = -input;

		System.out.println(input);
	}
}
