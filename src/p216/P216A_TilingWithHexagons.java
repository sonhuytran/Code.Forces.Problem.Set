/**
 * 
 */
package p216;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P216A_TilingWithHexagons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		int result = (b * c) + c * (a - 1) + (a - 1) * (b - 1);
		System.out.println(result);
	}
}
