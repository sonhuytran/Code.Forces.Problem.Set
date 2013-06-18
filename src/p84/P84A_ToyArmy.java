/**
 * 
 */
package p84;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P84A_ToyArmy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();

		long result = 0;

		if (n % 2 == 0) {
			result = n / 2 * 3;
		} else {
			result = (n * 3 - 1) / 2;
		}
		
		System.out.println(result);
	}

}
