/**
 * 
 */
package p246;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P246A_BuggySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		if (n < 3) {
			System.out.println(-1);
		} else {
			StringBuilder stringBuilder = new StringBuilder();

			while (n > 0) {
				stringBuilder.append(n);
				stringBuilder.append(" ");
				n--;
			}

			System.out.println(stringBuilder.toString().trim());
		}
	}

}
