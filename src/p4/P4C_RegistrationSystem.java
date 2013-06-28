package p4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P4C_RegistrationSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] usernames = new String[n];

		for (int i = 0; i < n; i++) {
			usernames[i] = scanner.nextLine();
		}

		scanner.close();
		Map<String, Integer> names = new HashMap<>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String name = usernames[i];
			Integer count = names.get(name);

			if (count == null) {
				names.put(name, 0);
				result.append("OK\n");
			} else {
				count++;
				result.append(name);
				result.append(count);
				result.append("\n");
				names.put(name, count);
			}
		}

		System.out.println(result.toString().trim());
	}
}
