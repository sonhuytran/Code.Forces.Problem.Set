package p173;

import java.util.Scanner;

public class P173A_RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		String cycle1 = scanner.next();
		String cycle2 = scanner.next();
		scanner.close();

		int m = cycle1.length();
		int k = cycle2.length();
		int gcd = greatestCommonDivisor(m, k);
		int lcd = m / gcd * k;
		int mIndex = 0, kIndex = 0;
		int result = 0, resultM = 0, resultK = 0;

		if (n > lcd) {
			int mRound = k / gcd;

			while (mRound > 0) {
				result = round(cycle1.charAt(mIndex), cycle2.charAt(kIndex));

				if (result > 0) {
					resultM++;
				} else if (result < 0) {
					resultK++;
				}

				mIndex++;

				if (mIndex >= m) {
					mIndex = 0;
					mRound--;
				}

				kIndex++;

				if (kIndex >= k) {
					kIndex = 0;
				}
			}

			resultM *= n / lcd;
			resultK *= n / lcd;
			n %= lcd;
		}

		mIndex = 0;
		kIndex = 0;

		while (n > 0) {
			result = round(cycle1.charAt(mIndex), cycle2.charAt(kIndex));

			if (result > 0) {
				resultM++;
			} else if (result < 0) {
				resultK++;
			}

			mIndex++;

			if (mIndex >= m) {
				mIndex = 0;
			}

			kIndex++;

			if (kIndex >= k) {
				kIndex = 0;
			}

			n--;
		}

		System.out.println(resultK + " " + resultM);
	}

	private static int round(char ch1, char ch2) {
		if (ch1 == ch2) {
			return 0;
		}

		if (ch1 == 'R') {
			if (ch2 == 'S') {
				return 1;
			} else {
				return -1;
			}
		} else if (ch1 == 'P') {
			if (ch2 == 'R') {
				return 1;
			} else {
				return -1;
			}
		} else {
			if (ch2 == 'P') {
				return 1;
			} else {
				return -1;
			}
		}
	}

	private static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}
