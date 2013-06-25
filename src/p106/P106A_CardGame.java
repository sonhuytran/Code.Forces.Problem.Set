package p106;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P106A_CardGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char trump = scanner.nextLine().charAt(0);
		String card1 = scanner.next();
		String card2 = scanner.next();
		scanner.close();

		boolean defeat = false;

		if (card1.charAt(1) == trump && card2.charAt(1) != trump) {
			defeat = true;
		} else if (card1.charAt(1) == card2.charAt(1)) {
			Map<Character, Integer> ranks = new HashMap<>();
			ranks.put('6', 6);
			ranks.put('7', 7);
			ranks.put('8', 8);
			ranks.put('9', 9);
			ranks.put('T', 10);
			ranks.put('J', 11);
			ranks.put('Q', 12);
			ranks.put('K', 13);
			ranks.put('A', 14);

			int rank1 = ranks.get(card1.charAt(0));
			int rank2 = ranks.get(card2.charAt(0));

			if (rank1 > rank2) {
				defeat = true;
			}
		}

		System.out.println(defeat ? "YES" : "NO");
	}
}
