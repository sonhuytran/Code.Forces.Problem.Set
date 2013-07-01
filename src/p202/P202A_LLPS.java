package p202;

import java.util.Scanner;

public class P202A_LLPS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		char chMax = 'a' - 1;
		int countMax = -1;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch > chMax) {
				chMax = ch;
				countMax = 1;
			} else if (ch == chMax) {
				countMax++;
			}
		}

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < countMax; i++) {
			output.append(chMax);
		}
		
		System.out.println(output);
	}
}
