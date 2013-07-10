package p251;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P251A_PointsOnLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt(), d = reader.nextInt();
		int[] points = reader.nextIntArray(n);
		int maxi = n - 2, maxPoint = 0;
		int i = 0, j = 0;
		long result = 0;

		for (; i < maxi;) {
			maxPoint = points[i] + d;
			j = i + 2;

			while (j < n && points[j] <= maxPoint) {
				j++;
			}

			if (j > i + 2) {
				result += combination(j - i, 3);
				i = j - 2;
			} else {
				i++;
			}
		}

		System.out.println(result);
	}

	private static long combination(int n, int k) {
		if (k < n / 2) {
			k = n - k;
		}

		long result = 1;

		for (int i = k + 1, j = 1; i <= n; i++, j++) {
			result = result * i / j;
		}

		return result;
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
