package p157;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P157B_Trace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> radis = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			radis.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(radis, Collections.reverseOrder());

		long coef = 0;

		for (int i = 0; i < n; i += 2) {
			int radi = radis.get(i);
			coef += radi * radi;
		}

		for (int i = 1; i < n; i += 2) {
			int radi = radis.get(i);
			coef -= radi * radi;
		}

		System.out.println(coef * Math.PI);
	}
}
