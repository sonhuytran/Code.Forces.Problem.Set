package p245;

import java.util.Scanner;

public class P245A_SystemAdministrator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int xa = 0, ya = 0, xb = 0, yb = 0, t = 0, x = 0, y = 0;

		for (int i = 0; i < n; i++) {
			t = scanner.nextInt();
			x = scanner.nextInt();
			y = scanner.nextInt();

			if (t == 1) {
				xa += x;
				ya += y;
			} else {
				xb += x;
				yb += y;
			}
		}

		scanner.close();

		String resulta = (xa >= ya) ? "LIVE" : "DEAD";
		String resultb = (xb >= yb) ? "LIVE" : "DEAD";
		System.out.println(resulta);
		System.out.print(resultb);
	}
}
