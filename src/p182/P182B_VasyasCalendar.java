package p182;

import java.util.Scanner;

public class P182B_VasyasCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		long result = 0;

		for (int i = 0; i < n - 1; i++) {
			result += d - scanner.nextInt();
		}

		scanner.nextInt();
		scanner.close();
		
		System.out.println(result);
	}
}
