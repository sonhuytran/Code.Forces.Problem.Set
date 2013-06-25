package p94;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P94A_RestoringPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, Character> digits = new HashMap<String, Character>();

		for (char i = '0'; i <= '9'; i++) {
			digits.put(scanner.nextLine(), i);
		}

		scanner.close();

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 80; i += 10) {
			String key = input.substring(i, i + 10);
			stringBuilder.append(digits.get(key));
		}
		
		System.out.println(stringBuilder);
	}
}
