/**
 * 
 */
package p104;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P104A_Blackjack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int[] a = { 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 15, 4 };
		int needed = n - 10;
		
		if (needed < 0 || needed > 11) {
			System.out.println(0);
		} else {
			System.out.println(a[needed]);
		}
	}
}
