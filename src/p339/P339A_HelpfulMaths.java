package p339;

import java.util.Scanner;

public class P339A_HelpfulMaths {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		StringBuilder s3 = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1') {
				s1.append("+1");
			} else if (input.charAt(i) == '2') {
				s2.append("+2");
			} else if (input.charAt(i) == '3') {
				s3.append("+3");
			}
		}

		s1.append(s2).append(s3);
		s1.deleteCharAt(0);

		System.out.print(s1.toString());
	}
}
