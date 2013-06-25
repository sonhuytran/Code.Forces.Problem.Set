package p34;

import java.util.Scanner;

public class P34A_Reconnaissance2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int firstHeight = scanner.nextInt();
		int currentHeight = firstHeight, nextHeight = 0, difference = 0, minIndex = -1;
		int minimum = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			nextHeight = scanner.nextInt();
			difference = Math.abs(nextHeight - currentHeight);

			if (difference < minimum) {
				minimum = difference;
				minIndex = i;
			}

			currentHeight = nextHeight;
		}

		scanner.close();
		difference = Math.abs(currentHeight - firstHeight);

		if (difference < minimum) {
			System.out.println(n + " " + 1);
		} else {
			System.out.println((minIndex) + " " + (minIndex + 1));
		}
	}
}
