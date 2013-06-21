/**
 * 
 */
package p305A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P305A_StrangeAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		int[] mySet = new int[5];
		Arrays.fill(mySet, -1);

		for (int i = 0; i < n; i++) {
			if (numbers[i] == 0) {
				mySet[0] = 0;
			} else if (numbers[i] == 100) {
				mySet[3] = 100;
			} else if (numbers[i] < 10) {
				mySet[1] = numbers[i];
			} else if (numbers[i] % 10 == 0) {
				mySet[2] = numbers[i];
			} else {
				mySet[4] = numbers[i];
			}
		}

		boolean include4 = false;

		if (mySet[1] <= -1 && mySet[2] <= -1) {
			include4 = true;
		}

		StringBuilder stringBuilder = new StringBuilder();
		int count = 0;

		for (int i = 0; i < 4; i++) {
			if (mySet[i] > -1) {
				stringBuilder.append(mySet[i]);
				stringBuilder.append(" ");
				count++;
			}
		}

		if (include4 && mySet[4] > -1) {
			stringBuilder.append(mySet[4]);
			count++;
		}

		System.out.println(count);
		System.out.println(stringBuilder);
	}
}
