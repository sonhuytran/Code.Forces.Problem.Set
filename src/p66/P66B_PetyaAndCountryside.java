package p66;

import java.util.Scanner;

public class P66B_PetyaAndCountryside {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] height = new int[n + 2];

		for (int i = 1; i <= n; i++) {
			height[i] = scanner.nextInt();
		}

		height[0] = height[n + 1] = Integer.MAX_VALUE;
		scanner.close();

		int[] lengths = new int[n + 1];

		int i = 1, index = 0, length = 0;

		while (i <= n) {
			index = i + 1;

			while (index <= n && height[index] <= height[index - 1]) {
				index++;
			}

			index--;
			length = index - i + 1;

			for (int j = i; j <= index; j++) {
				lengths[j] = length--;
			}

			i = index + 1;
		}

		i = n;

		while (i >= 1) {
			index = i - 1;

			while (index >= 1 && height[index] <= height[index + 1]) {
				index--;
			}

			index++;
			length = i - index + 1;

			for (int j = i; j >= index; j--) {
				lengths[j] += (length - 1);
				length--;
			}

			i = index - 1;
		}

		int max = Integer.MIN_VALUE;

		for (int j = 1; j <= n; j++) {
			if (lengths[j] > max) {
				max = lengths[j];
			}
		}

		System.out.println(max);
	}
}
