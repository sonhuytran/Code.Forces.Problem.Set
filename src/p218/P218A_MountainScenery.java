package p218;

import java.util.Scanner;

public class P218A_MountainScenery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		n = 2 * n + 1;
		int[] peaks = new int[n];

		for (int i = 0; i < n; i++) {
			peaks[i] = scanner.nextInt();
		}

		scanner.close();
		int index = 1, temp = 0;

		while (k > 0) {
			temp = peaks[index] - 1;

			if (temp > peaks[index - 1] && temp > peaks[index + 1]) {
				peaks[index] = temp;
				k--;
			}

			index += 2;
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			result.append(peaks[i]);
			result.append(' ');
		}
		
		System.out.println(result.toString().trim());
	}
}
