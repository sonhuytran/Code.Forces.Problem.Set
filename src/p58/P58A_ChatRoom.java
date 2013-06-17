/**
 * 
 */
package p58;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P58A_ChatRoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String hello = "hello";
		int index = 0;
		boolean found = true;

		for (int i = 0; i < hello.length(); i++) {
			char ch = hello.charAt(i);

			while (index < input.length() && input.charAt(index) != ch) {
				index++;
			}

			if (index >= input.length()) {
				found = false;
				break;
			} else {
				index++;
			}
		}

		System.out.println(found ? "YES" : "NO");
	}
}
