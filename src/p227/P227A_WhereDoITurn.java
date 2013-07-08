package p227;

import java.util.Scanner;

public class P227A_WhereDoITurn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long Ax = scanner.nextInt();
		long Ay = scanner.nextInt();
		long Bx = scanner.nextInt();
		long By = scanner.nextInt();
		long Cx = scanner.nextInt();
		long Cy = scanner.nextInt();
		scanner.close();

		// if (Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By) == 0) {
		// System.out.println("TOWARDS");
		// return;
		// }

		if ((Bx - Ax) * (Cx - Bx) + (By - Ay) * (Cy - By) == 0) {
			System.out.println("RIGHT ANGLE AT B");
		} else {
			System.out.println("TOWARDS");
		}
	}
}
