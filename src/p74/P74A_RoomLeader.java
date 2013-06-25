package p74;

import java.util.Scanner;

public class P74A_RoomLeader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		int max = Integer.MIN_VALUE, point = 0;
		int hack = 0, unhack = 0, hackPoint = 100, unhackPoint = -50;
		String leader = "", name = "";

		for (int i = 0; i < n; i++) {
			point = 0;
			name = scanner.next();
			hack = scanner.nextInt();
			unhack = scanner.nextInt();

			for (int j = 0; j < 5; j++) {
				point += scanner.nextInt();
			}

			point += hack * hackPoint + unhack * unhackPoint;

			if (point > max) {
				max = point;
				leader = name;
			}

			scanner.nextLine();
		}

		scanner.close();
		System.out.println(leader);
	}
}
