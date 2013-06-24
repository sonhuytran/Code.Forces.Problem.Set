/**
 * 
 */
package p242;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P242A_HeadsOrTails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		ArrayList<Integer> ns = new ArrayList<>();
		ArrayList<Integer> ms = new ArrayList<>();
		int count = 0;

		for (int n = a; n <= x; n++) {
			int maxM = Math.min(n - 1, y);

			for (int m = b; m <= maxM; m++) {
				ns.add(n);
				ms.add(m);
				count++;
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(count);
		stringBuilder.append("\n");

		for (int i = 0; i < count; i++) {
			stringBuilder.append(ns.get(i));
			stringBuilder.append(" ");
			stringBuilder.append(ms.get(i));
			stringBuilder.append("\n");
		}

		System.out.println(stringBuilder);
	}
}
