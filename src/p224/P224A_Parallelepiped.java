/**
 * 
 */
package p224;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P224A_Parallelepiped {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();

		scanner.close();

		int a = (int) Math.sqrt(x1 * x2 / x3);
		int b = x1 / a;
		int h = x2 / a;

		int result = 4 * (a + b + h);

		System.out.println(result);
	}
}
