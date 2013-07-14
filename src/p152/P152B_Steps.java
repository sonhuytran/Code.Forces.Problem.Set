package p152;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P152B_Steps {
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt(), m = reader.nextInt();
		int x0 = reader.nextInt(), y0 = reader.nextInt();
		int k = reader.nextInt();
		int[][] vectors = reader.next2DIntArray(k, 2);
		long stepCount = 0, stepx, stepy, step;

		for (int i = 0; i < k; i++) {
			if (vectors[i][0] > 0) {
				stepx = (n - x0) / vectors[i][0];
			} else if (vectors[i][0] < 0) {
				stepx = (1 - x0) / vectors[i][0];
			} else {
				stepx = Integer.MAX_VALUE;
			}

			if (vectors[i][1] > 0) {
				stepy = (m - y0) / vectors[i][1];
			} else if (vectors[i][1] < 0) {
				stepy = (1 - y0) / vectors[i][1];
			} else {
				stepy = Integer.MAX_VALUE;
			}

			step = Math.min(stepx, stepy);
			stepCount += step;
			x0 += step * vectors[i][0];
			y0 += step * vectors[i][1];
		}

		System.out.println(stepCount);
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

		public int[][] next2DIntArray(int n, int m) {
			int[][] result = new int[n][];
			for (int i = 0; i < n; i++) {
				result[i] = nextIntArray(m);
			}
			return result;
		}
	}
}
