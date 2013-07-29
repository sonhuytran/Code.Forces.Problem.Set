package p332;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P332B_MaximumAbsurdity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] abs = reader.nextIntArray(n);

		int i = 0, maxi = n - k + 1;
		long[] allSums = new long[maxi];

		for (i = 0; i < k; i++) {
			allSums[0] += abs[i];
		}

		for (i = 1; i < maxi; i++) {
			allSums[i] = allSums[i - 1] - abs[i - 1] + abs[i + k - 1];
		}

		// System.out.println(Arrays.toString(allSums));
		int resulta = 0, resultb = 0, maxa = maxi - k, maxb = maxi;
		long max = Long.MIN_VALUE, value;

		for (int a = 0; a < maxa; a++) {
			for (int b = a + k; b < maxb; b++) {
				value = allSums[a] + allSums[b];

				if (value > max) {
					max = value;
					resulta = a;
					resultb = b;
				}
			}
		}

		System.out.println((resulta + 1) + " " + (resultb + 1));
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
