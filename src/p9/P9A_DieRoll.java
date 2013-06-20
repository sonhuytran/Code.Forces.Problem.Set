/**
 * 
 */
package p9;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P9A_DieRoll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		scanner.close();

		int max = Math.max(y, w);
		int chances = 7 - max;
		String[] outputs = { "0/1", "1/6", "1/3", "1/2", "2/3", "5/6", "1/1" };

		System.out.println(outputs[chances]);
	}
}
