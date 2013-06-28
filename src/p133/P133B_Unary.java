package p133;

import java.util.Scanner;

public class P133B_Unary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		char[] operations = { '>', '<', '+', '-', '.', ',', '[', ']' };
		String[] values = { "1000", "1001", "1010", "1011", "1100", "1101",
				"1110", "1111" };
		StringBuilder stringBuilder = new StringBuilder(400);

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			for (int j = 0; j < 8; j++) {
				if (ch == operations[j]) {
					stringBuilder.append(values[j]);
					break;
				}
			}
		}

		int sum = 0, temp = 1;

		for (int i = stringBuilder.length() - 1; i >= 0; i--) {
			if (stringBuilder.charAt(i) == '1') {
				sum = (sum + temp) % 1000003;
			}
			
			temp = (temp * 2) % 1000003;
		}
		
		System.out.println(sum);
	}
}