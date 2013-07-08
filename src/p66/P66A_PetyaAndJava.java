package p66;

import java.math.BigInteger;
import java.util.Scanner;

public class P66A_PetyaAndJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String[] types = { "byte", "short", "int", "long" };
		BigInteger[] upperBounds = { BigInteger.valueOf(127),
				BigInteger.valueOf(32767), BigInteger.valueOf(2147483647),
				BigInteger.valueOf(9223372036854775807L) };
		BigInteger[] lowerBounds = { BigInteger.valueOf(-128),
				BigInteger.valueOf(-32768), BigInteger.valueOf(-2147483648),
				BigInteger.valueOf(-9223372036854775808L) };
		BigInteger number = new BigInteger(input);

		for (int i = 0; i < lowerBounds.length; i++) {
			if (number.compareTo(lowerBounds[i]) >= 0
					&& number.compareTo(upperBounds[i]) <= 0) {
				System.out.println(types[i]);
				return;
			}
		}
		
		System.out.println("BigInteger");
	}
}
