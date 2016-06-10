package p136;

import java.util.Scanner;

public class P136B_TernaryLogic {

	private static char[] ternary(int number) {
		StringBuilder stringBuilder = new StringBuilder();

		while (number > 0) {
			stringBuilder.insert(0, number % 3);
			number /= 3;
		}

		int length = stringBuilder.length();
		char[] result = new char[length];
		stringBuilder.getChars(0, length, result, 0);

		return result;
	}

	private static long restore(byte[] ternary) {
		long temp = 1, index = ternary.length - 1, result = 0;

		while (index >= 0) {
			result += temp * ternary[(int) index];
			temp *= 3;
		}

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		char[] ternarya = ternary(a);
		char[] ternaryb = ternary(b);

		int indexa = ternarya.length - 1;
		int indexb = ternaryb.length - 1;
		byte[] ternaryc = new byte[Math.max(indexa, indexb)];
		int indexc = ternaryc.length - 1;

		while (indexa >= 0 && indexb >= 0) {
			byte x = (byte) (ternaryb[indexb] - ternarya[indexa]);

			if (x < 0) {
				x += 3;
			}

			ternaryc[indexc] = x;
			indexa--;
			indexb--;
			indexc--;
		}

		while (indexb >= 0) {
			ternaryc[indexc--] = (byte) (ternaryb[indexb--] - '0');
		}
	}
}
