/**
 * 
 */
package p160;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P160B_UnluckyTicket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String ticket = scanner.nextLine();
		scanner.close();

		ArrayList<Character> firstHalf = new ArrayList<>(n);
		ArrayList<Character> secondHalf = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			firstHalf.add(ticket.charAt(i));
			secondHalf.add(ticket.charAt(i + n));
		}

		Collections.sort(firstHalf);
		Collections.sort(secondHalf);

		boolean result = true;

		if (firstHalf.get(0) == secondHalf.get(0)) {
			result = false;
		} else if (firstHalf.get(0) < secondHalf.get(0)) {
			for (int i = 1; i < n; i++) {
				if (firstHalf.get(i) >= secondHalf.get(i)) {
					result = false;
					break;
				}
			}
		} else {
			for (int i = 1; i < n; i++) {
				if (firstHalf.get(i) <= secondHalf.get(i)) {
					result = false;
					break;
				}
			}
		}

		System.out.println(result ? "YES" : "NO");
	}
}
