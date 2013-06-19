/**
 * 
 */
package p146;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P146A_LuckyTicket {

	private static boolean isLucky(String number) {
		if (number.isEmpty()) {
			return false;
		}

		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) != '4' && number.charAt(i) != '7') {
				return false;
			}
		}

		return true;
	}

	private static int sumDigit(String number) {
		int sum = 0;

		for (int i = 0; i < number.length(); i++) {
			sum += (number.charAt(i) - '0');
		}

		return sum;
	}

	private static boolean isLuckyTicket(String ticket, int n) {
		if (!isLucky(ticket)) {
			return false;
		}

		int half = n / 2;
		String firstHalf = ticket.substring(0, half);
		String secondHalf = ticket.substring(half);

		return (sumDigit(firstHalf) == sumDigit(secondHalf));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();
		String ticket = scanner.nextLine();

		scanner.close();

		boolean result = isLuckyTicket(ticket, n);
		System.out.println(result ? "YES" : "NO");
	}
}
