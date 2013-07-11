package p80;

import java.util.Scanner;

public class P80B_Depression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(":");
		scanner.close();

		int h = Integer.valueOf(input[0]);
		int m = Integer.valueOf(input[1]);

		if (h >= 12) {
			h -= 12;
		}

		int minAngle = m * 6;

		if (m % 2 == 0) {
			int hourAngle = h * 30 + m / 2;
			System.out.println(hourAngle + " " + minAngle);
		} else {
			double hourAngle = h * 30 + m / 2.0;
			System.out.println(hourAngle + " " + minAngle);
		}
	}
}
