/**
 * 
 */
package p38;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P38A_Army {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] progress = new int[n];

		for (int i = 1; i < n; i++) {
			progress[i] = scanner.nextInt();
		}

		scanner.nextLine();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		scanner.close();

		int rank = a;
		int years = 0;

		while (rank < b) {
			years += progress[rank];
			rank++;
		}
		
		System.out.println(years);
	}
}
