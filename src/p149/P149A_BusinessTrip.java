/**
 * 
 */
package p149;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P149A_BusinessTrip {

	private static int countMonth(int k, int[] growing) {
		ArrayList<Integer> sortedGrowing = new ArrayList<>();
		int growingLength = growing.length;

		for (int i = 0; i < growingLength; i++) {
			sortedGrowing.add(growing[i]);
		}

		Collections.sort(sortedGrowing, Collections.reverseOrder());

		int index = -1, grew = 0;

		while (grew < k) {
			index++;

			if (index < growingLength) {
				grew += sortedGrowing.get(index);
			} else {
				index = -2;
				break;
			}
		}

		return index + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int k = scanner.nextInt();
		scanner.nextLine();

		int nMonths = 12;
		int[] growing = new int[nMonths];

		for (int i = 0; i < nMonths; i++) {
			growing[i] = scanner.nextInt();
		}

		scanner.close();

		int result = countMonth(k, growing);
		System.out.println(result);
	}
}
