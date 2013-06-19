/**
 * 
 */
package p221;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P221A_LittleElephantAndFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		StringBuilder stringBuilder = new StringBuilder(n + "");

		for (int i = 1; i < n; i++) {
			stringBuilder.append(" ");
			stringBuilder.append(i);
		}

		System.out.println(stringBuilder.toString());
	}

}
