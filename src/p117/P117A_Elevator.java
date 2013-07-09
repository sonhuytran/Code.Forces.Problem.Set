package p117;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P117A_Elevator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] data = reader.next2DIntArray(n, 3);
		StringBuilder result = new StringBuilder();
		int w = (m - 1) * 2, f = 0, z = 0, start = 0, end = 0;

		for (int i = 0; i < n; i++) {
			if (data[i][1] == data[i][0]) {
				end = data[i][2];
			} else if (data[i][1] > data[i][0]) {
				f = data[i][0] - 1;
				z = (int) Math.ceil((data[i][2] - f) * 1.0 / w);
				start = z * w + f;
				end = start + (data[i][1] - data[i][0]);
			} else {
				f = w + 1 - data[i][0];
				z = (int) Math.ceil((data[i][2] - f) * 1.0 / w);
				start = z * w + f;
				end = start + (data[i][0] - data[i][1]);
			}

			result.append(end);
			result.append('\n');
		}

		System.out.println(result);
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
