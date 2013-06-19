package p114;

import java.util.Scanner;

public class P114A_Cifera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long k = scanner.nextLong();
		long l = scanner.nextLong();

		scanner.close();

		long number = k;
		int importance = 0;

		while (number < l) {
			number *= k;
			importance++;
		}

		if (number == l) {
			System.out.println("YES");
			System.out.println(importance);
		} else {
			System.out.println("NO");
		}
	}
}
