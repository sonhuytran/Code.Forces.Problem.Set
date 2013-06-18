/**
 * 
 */
package p263;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P263B_Squares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();

		ArrayList<Integer> a = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}

		scanner.close();

		if (k > n) {
			System.out.println(-1);
			return;
		}

		Collections.sort(a);
		int result = a.get(n - k);

		System.out.println(result + " " + result);
	}
}
