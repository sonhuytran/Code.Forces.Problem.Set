/**
 * 
 */
package p12;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P12A_SuperAgent {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			password.append(scanner.next());
		}

		scanner.close();
		String string1 = password.toString();
		String string2 = password.reverse().toString();
		boolean result = string1.equals(string2);

		System.out.println(result ? "YES" : "NO");
	}
}
