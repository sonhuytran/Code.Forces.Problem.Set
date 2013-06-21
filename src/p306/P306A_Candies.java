/**
 * 
 */
package p306;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P306A_Candies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		int equalValue = n / m;
		int moreValue = equalValue + 1;
		int rest = n % m;
		int equalNumbers = m - rest;

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < equalNumbers; i++) {
			stringBuilder.append(equalValue);
			stringBuilder.append(" ");
		}
		
		for (int i = 0; i < rest; i++) {
			stringBuilder.append(moreValue);
			stringBuilder.append(" ");
		}
		
		System.out.println(stringBuilder);
	}
}
