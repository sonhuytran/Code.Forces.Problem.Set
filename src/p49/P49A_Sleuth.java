package p49;

import java.util.Scanner;

public class P49A_Sleuth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String question = scanner.nextLine();
		scanner.close();

		int index = question.length() - 1;

		while (index >= 0
				&& (question.charAt(index) == '?' || question.charAt(index) == ' ')) {
			index--;
		}

		if (index >= 0) {
			char c = Character.toLowerCase(question.charAt(index));
			
			if ("aeiouy".indexOf(c) >= 0) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}
}
