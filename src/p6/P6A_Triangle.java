/**
 * 
 */
package p6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P6A_Triangle {

	private static boolean isTriangle(int a, int b, int c) {
		if (a + b > c && b + c > a && c + a > b && b - a < c && c - a < b
				&& c - b < a) {
			return true;
		}

		return false;
	}

	private static boolean isDegenerateTriangle(int a, int b, int c) {
		return a + b == c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> sides = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			sides.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(sides);

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				for (int k = j + 1; k < 4; k++) {
					if (isTriangle(sides.get(i), sides.get(j), sides.get(k))) {
						System.out.println("TRIANGLE");
						return;
					}
				}
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				for (int k = j + 1; k < 4; k++) {
					if (isDegenerateTriangle(sides.get(i), sides.get(j),
							sides.get(k))) {
						System.out.println("SEGMENT");
						return;
					}
				}
			}
		}

		System.out.println("IMPOSSIBLE");
	}
}
