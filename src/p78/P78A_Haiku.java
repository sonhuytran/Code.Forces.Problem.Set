package p78;

import java.util.Scanner;

public class P78A_Haiku {

	private static boolean isHaikuLine(String line, int nVowels) {
		int count = 0;
		String vowels = "aeiou";

		for (int i = 0; i < line.length(); i++) {
			if (vowels.indexOf(line.charAt(i)) >= 0) {
				count++;

				if (count > nVowels) {
					return false;
				}
			}
		}

		if (count < nVowels) {
			return false;
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		String line3 = scanner.nextLine();
		scanner.close();

		if (isHaikuLine(line1, 5) && isHaikuLine(line2, 7)
				&& isHaikuLine(line3, 5)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
