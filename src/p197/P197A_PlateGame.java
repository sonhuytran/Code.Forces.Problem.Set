package p197;

import java.util.Scanner;

public class P197A_PlateGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();

		// If first player can't make first move (table is too small and plate
		// doesn't fit it, i.e. 2r?>?min(a,?b)), second player wins. Else first
		// player wins. Winning strategy for first player: place first plate to
		// the center of table. After that he symmetrically reflects moves of
		// second player with respect to center of table. If second player has
		// move, first player has symmetrical move, too. If not, first player
		// won.

		if (r * 2 > (a >= b ? b : a)) {
			System.out.println("Second");
		} else {
			System.out.println("First");
		}
	}
}
