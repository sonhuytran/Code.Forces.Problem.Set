/**
 * 
 */
package p296;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P296A_YaroslavAndPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			numbers.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(numbers);

		int index = 0, i = 0;

		int max = n / 2;

		if (n % 2 == 1) {
			max++;
		}

		while (index < n) {
			int number = numbers.get(index);
			i = index + 1;

			while (i < n && numbers.get(i) == number) {
				i++;
			}

			if (i - index > max) {
				System.out.println("NO");
				return;
			}

			index = i;
		}

		System.out.println("YES");
	}
}
