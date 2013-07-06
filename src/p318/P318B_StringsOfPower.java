package p318;

import java.util.Scanner;

public class P318B_StringsOfPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String heavy = "heavy";
		String metal = "metal";

		int iHeavy = -1;
		int iMetal = -1;
		int current = 0;
		int countHeavy = 0;
		long count = 0;

		do {
			iHeavy = input.indexOf(heavy, current);
			iMetal = input.indexOf(metal, current);

			if (iMetal >= 0 && iHeavy >= 0) {
				while (iHeavy >= 0 && iHeavy < iMetal) {
					countHeavy++;
					iHeavy = input.indexOf(heavy, iHeavy + 5);
				}

				count += countHeavy;
				current = iMetal + 5;
			} else if (iHeavy < 0) {
				while (iMetal >= 0) {
					count += countHeavy;
					iMetal = input.indexOf(metal, iMetal + 5);
				}
			}
		} while (iMetal >= 0);

		System.out.println(count);
	}
}