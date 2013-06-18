/**
 * 
 */
package p265;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P265A_ColorfulStones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String stones = scanner.nextLine();
		String instructions = scanner.nextLine();

		scanner.close();
		int i = 0, j = 0;

		for (i = 0, j = 0; i < instructions.length(); i++) {
			char ch1 = instructions.charAt(i);
			char ch2 = stones.charAt(j);

			if (ch1 == ch2) {
				j++;
			}
		}

		System.out.println(j + 1);
	}
}
