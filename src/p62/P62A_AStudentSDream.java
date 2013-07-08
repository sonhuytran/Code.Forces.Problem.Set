package p62;

import java.util.Scanner;

public class P62A_AStudentSDream {

	private static boolean canHold(int girlHand, int boyHand) {
		if (girlHand - boyHand > 1) {
			return false;
		}

		if (boyHand - girlHand * 2 > 2) {
			return false;
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gl = scanner.nextInt();
		int gr = scanner.nextInt();
		int bl = scanner.nextInt();
		int br = scanner.nextInt();
		scanner.close();

		if (canHold(gl, br) || canHold(gr, bl)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
