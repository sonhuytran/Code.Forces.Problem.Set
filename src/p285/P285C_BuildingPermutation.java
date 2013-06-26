/**
 * 
 */
package p285;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P285C_BuildingPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			numbers.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(numbers);

		long moves = 0;

		for (int i = 0; i < n; i++) {
			moves += Math.abs(numbers.get(i) - i - 1);
		}

		System.out.println(moves);
	}
}
