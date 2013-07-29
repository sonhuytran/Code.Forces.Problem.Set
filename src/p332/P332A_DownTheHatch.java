/**
 * 
 */
package p332;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P332A_DownTheHatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String moves = scanner.nextLine();
		scanner.close();

		int i = 0, count = 0;
		char ch;

		do {
			i += n;

			if (i < moves.length()) {
				ch = moves.charAt(i - 1);

				if (moves.charAt(i - 2) == ch && moves.charAt(i - 3) == ch) {
					count++;
				}
			}
		} while (i < moves.length());
		
		System.out.println(count);
	}
}
