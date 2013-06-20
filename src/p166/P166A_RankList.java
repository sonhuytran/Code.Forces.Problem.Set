/**
 * 
 */
package p166;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P166A_RankList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();

		int[] p = new int[n];
		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
			t[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((p[i] < p[j]) || (p[i] == p[j] && t[i] > t[j])) {
					swap(p, i, j);
					swap(t, i, j);
				}
			}
		}

		int ktemp = k - 1;
		int count = 1;

		int i = ktemp + 1;

		while (i < n && p[i] == p[ktemp] && t[i] == t[ktemp]) {
			i++;
			count++;
		}

		i = ktemp - 1;

		while (i >= 0 && p[i] == p[ktemp] && t[i] == t[ktemp]) {
			i--;
			count++;
		}
		
		System.out.println(count);
	}

	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
