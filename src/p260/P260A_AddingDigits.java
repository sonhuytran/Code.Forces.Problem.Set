package p260;

import java.math.BigInteger;
import java.util.Scanner;

public class P260A_AddingDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		BigInteger result = BigInteger.valueOf(a);
		BigInteger dividant = BigInteger.valueOf(b);
		BigInteger[] digits = new BigInteger[11];

		for (int i = 0; i < 11; i++) {
			digits[i] = BigInteger.valueOf(i);
		}

		for (int i = 0; i < n; i++) {
			boolean hasresult = false;
			result = result.multiply(digits[10]);

			for (int j = 0; j < 10; j++) {
				BigInteger temp = result.add(digits[j]);

				if (temp.mod(dividant).equals(BigInteger.ZERO)) {
					hasresult = true;
					result = temp;
					break;
				}
			}
			
			if (!hasresult) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(result);
	}
}
