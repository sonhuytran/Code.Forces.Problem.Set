package p334;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P334B_EightPointSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int[][] data = reader.next2DIntArray(8, 2);
		int temp;

		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 8; j++) {
				if ((data[i][0] > data[j][0])
						|| (data[i][0] == data[j][0] && data[i][1] > data[j][1])) {
					temp = data[i][0];
					data[i][0] = data[j][0];
					data[j][0] = temp;

					temp = data[i][1];
					data[i][1] = data[j][1];
					data[j][1] = temp;
				}
			}
		}

		int x1 = data[0][0], x2 = data[3][0], x3 = data[5][0];
		int y1 = data[0][1], y2 = data[1][1], y3 = data[2][1];

		if (x1 < x2 && x2 < x3 && y1 < y2 && y2 < y3 && data[1][0] == x1
				&& data[2][0] == x1 && data[4][0] == x2 && data[6][0] == x3
				&& data[7][0] == x3 && data[3][1] == y1 && data[4][1] == y3
				&& data[5][1] == y1 && data[6][1] == y2 && data[7][1] == y3) {
			System.out.println("respectable");
		} else {
			System.out.println("ugly");
		}
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
