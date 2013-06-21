/**
 * 
 */
package p315;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P315A_SerejaAndBottles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < b.length; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		boolean[] isOpened = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && a[j] == b[i]) {
					isOpened[j] = true;
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (!isOpened[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
