package p151;

import java.util.Scanner;

public class P151B_PhoneNumbers {

	private static boolean isTaxi(String number) {
		char ch = number.charAt(0);

		if (number.charAt(1) == ch && number.charAt(3) == ch
				&& number.charAt(4) == ch && number.charAt(6) == ch
				&& number.charAt(7) == ch) {
			return true;
		}

		return false;
	}

	private static boolean isPizza(String number) {
		if (number.charAt(1) < number.charAt(0)
				&& number.charAt(3) < number.charAt(1)
				&& number.charAt(4) < number.charAt(3)
				&& number.charAt(6) < number.charAt(4)
				&& number.charAt(7) < number.charAt(6)) {
			return true;
		}

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), s = 0;
		String[] friends = new String[n];
		int[][] count = new int[n][3];
		int maxTaxi = 0, maxPizza = 0, maxGirl = 0;
		String phoneNumber;

		for (int i = 0; i < n; i++) {
			s = scanner.nextInt();
			friends[i] = scanner.next();

			for (int j = 0; j < s; j++) {
				phoneNumber = scanner.next();

				if (isTaxi(phoneNumber)) {
					count[i][0]++;

					if (count[i][0] > maxTaxi) {
						maxTaxi = count[i][0];
					}
				} else if (isPizza(phoneNumber)) {
					count[i][1]++;

					if (count[i][1] > maxPizza) {
						maxPizza = count[i][1];
					}
				} else {
					count[i][2]++;

					if (count[i][2] > maxGirl) {
						maxGirl = count[i][2];
					}
				}
			}
		}

		scanner.close();

		StringBuilder result = new StringBuilder();
		result.append("If you want to call a taxi, you should call: ");
		boolean first = true;

		for (int i = 0; i < n; i++) {
			if (count[i][0] == maxTaxi) {
				if (first) {
					result.append(friends[i]);
					first = false;
				} else {
					result.append(", ");
					result.append(friends[i]);
				}
			}
		}

		result.append(".\n");
		result.append("If you want to order a pizza, you should call: ");
		first = true;

		for (int i = 0; i < n; i++) {
			if (count[i][1] == maxPizza) {
				if (first) {
					result.append(friends[i]);
					first = false;
				} else {
					result.append(", ");
					result.append(friends[i]);
				}
			}
		}

		result.append(".\n");
		result.append("If you want to go to a cafe with a wonderful girl, you should call: ");
		first = true;

		for (int i = 0; i < n; i++) {
			if (count[i][2] == maxGirl) {
				if (first) {
					result.append(friends[i]);
					first = false;
				} else {
					result.append(", ");
					result.append(friends[i]);
				}
			}
		}

		result.append('.');
		System.out.println(result);
	}
}
