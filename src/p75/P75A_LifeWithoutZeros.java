package p75;

import java.util.Scanner;

public class P75A_LifeWithoutZeros {

	private static long removeZeros(long number) {
		String string = String.valueOf(number);
		string = string.replace("0", "");
		return Long.parseLong(string);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		scanner.close();

		long c = a + b;
		long a1 = removeZeros(a), b1 = removeZeros(b), c1 = removeZeros(c);
		boolean result = (a1 + b1 == c1);

		System.out.println(result ? "YES" : "NO");
	}
}
