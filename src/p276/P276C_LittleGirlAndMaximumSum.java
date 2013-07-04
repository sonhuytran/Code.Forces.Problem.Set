package p276;

import java.util.Arrays;
import java.util.Scanner;

public class P276C_LittleGirlAndMaximumSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		int[] numbers = new int[n + 1];
		int[] counts = new int[n + 1];
		int left = 0, right = 0;

		for (int i = 1; i <= n; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i = 0; i < q; i++) {
			left = scanner.nextInt();
			right = scanner.nextInt();

			for (int j = left; j <= right; j++) {
				counts[j]++;
			}
		}

		scanner.close();
		Arrays.sort(numbers);
		Arrays.sort(counts);

		long sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += (numbers[i] * counts[i]);
		}
		
		System.out.println(sum);
	}
}
