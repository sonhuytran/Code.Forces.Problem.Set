package p208;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P208D_PrizesPrizesMorePrizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();
		int[] prizes = inputReader.nextIntArray(n);
		int[] prix = inputReader.nextIntArray(5);
		long[] count = new long[5];

		long sum = 0;
		int index = 0;

		for (int i = 0; i < n; i++) {
			sum += prizes[i];

			do {
				index = getPrixIndex(prix, sum);

				if (index > -1) {
					count[index] += sum / prix[index];
					sum %= prix[index];
				}
			} while (sum > 0 && index > -1);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(count[i] + " ");
		}

		System.out.println();
		System.out.println(sum);
	}

	private static int getPrixIndex(int[] prix, long prize) {
		int index = 4;

		while (index >= 0 && prix[index] > prize) {
			index--;
		}

		return index;
	}

	private static class InputReader {

		private InputStream stream;
		private byte[] buf = new byte[1 << 16];
		private int curChar;
		private int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c & 15;
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public static boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public int[] nextIntArray(int count) {
			int[] result = new int[count];
			for (int i = 0; i < count; i++) {
				result[i] = nextInt();
			}
			return result;
		}
	}
}
