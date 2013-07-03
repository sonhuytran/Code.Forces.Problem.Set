package p186;

import java.util.Scanner;

public class P186A_ComparingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();

		if (s1.length() != s2.length()) {
			System.out.println("NO");
			return;
		}

		int length = s1.length();
		int[] indexes = new int[2];
		int i = 0, j = 0;

		for (; i < length; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (j < 2) {
					indexes[j++] = i;
				} else {
					System.out.println("NO");
					return;
				}
			}
		}

		if (j < 2) {
			System.out.println("NO");
			return;
		}

		if (s1.charAt(indexes[0]) == s2.charAt(indexes[1])
				&& s1.charAt(indexes[1]) == s2.charAt(indexes[0])) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
