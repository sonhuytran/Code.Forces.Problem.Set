package p155;

import java.util.Scanner;

public class P155B_Combination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] top = new int[n];
		int[] bottom = new int[n];

		for (int i = 0; i < n; i++) {
			top[i] = scanner.nextInt();
			bottom[i] = scanner.nextInt();
		}

		scanner.close();

		int temp = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((bottom[i] < bottom[j])
						|| (bottom[i] == bottom[j] && top[i] < top[j])) {
					temp = bottom[i];
					bottom[i] = bottom[j];
					bottom[j] = temp;

					temp = top[i];
					top[i] = top[j];
					top[j] = temp;
				}
			}
		}

		int score = 0, ncards = 1, index = 0;

		while (ncards > 0 && index < n) {
			score += top[index];
			ncards += bottom[index] - 1;
			index++;
		}

		System.out.println(score);
	}
}