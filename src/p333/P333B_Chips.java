package p333;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class P333B_Chips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt(), m = reader.nextInt();
		int[][] banned = reader.next2DIntArray(m, 2);
		boolean[] bannedRows = new boolean[n];
		boolean[] bannedCols = new boolean[n];

		Arrays.fill(bannedRows, true);
		Arrays.fill(bannedCols, true);

		bannedRows[0] = bannedRows[n - 1] = false;
		bannedCols[0] = bannedCols[n - 1] = false;

		int x = 0, y = 0;

		for (int i = 0; i < m; i++) {
			x = banned[i][0];
			y = banned[i][1];

			bannedRows[x - 1] = false;
			bannedCols[y - 1] = false;
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (bannedCols[i]) {
				count++;
			}

			if (bannedRows[i]) {
				count++;
			}
		}

		if (n % 2 == 1 && bannedCols[n / 2] && bannedRows[n / 2] && count > 0) {
			count--;
		}

		System.out.println(count);
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
