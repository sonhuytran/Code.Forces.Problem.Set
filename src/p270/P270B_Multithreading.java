package p270;

import java.util.Scanner;

public class P270B_Multithreading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int[] threads = new int[n];

		for (int i = 0; i < n; i++) {
			threads[i] = scanner.nextInt();
		}

		scanner.close();

		int i = n - 1;

		while (i > 0 && threads[i] > threads[i - 1]) {
			i--;
		}

		System.out.println(i);
	}
}
