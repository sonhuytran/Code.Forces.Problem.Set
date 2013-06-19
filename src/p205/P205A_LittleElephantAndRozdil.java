/**
 * 
 */
package p205;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P205A_LittleElephantAndRozdil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		int n = scanner.nextInt();
		int[] costs = new int[n];

		for (int i = 0; i < n; i++) {
			costs[i] = scanner.nextInt();
		}

		scanner.close();

		int min = Integer.MAX_VALUE;
		int imin = -1;
		int countMin = 0;

		for (int i = 0; i < n; i++) {
			if (costs[i] < min) {
				min = costs[i];
				imin = i;
				countMin = 1;
			} else if (costs[i] == min) {
				countMin++;
			}
		}

		if (countMin > 1) {
			System.out.println("Still Rozdil");
		} else {
			System.out.println(imin + 1);
		}
	}
}