package p33;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class P33A_WhatIsForDinner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt(), m = reader.nextInt(), k = reader.nextInt();
		int[][] teeth = reader.next2DIntArray(n, 2);
		int[] canEat = new int[m + 1];
		int row = 0, viability = 0;
		Arrays.fill(canEat, Integer.MAX_VALUE);

		for (int i = 0; i < n; i++) {
			row = teeth[i][0];
			viability = teeth[i][1];

			if (viability < canEat[row]) {
				canEat[row] = viability;
			}
		}

		long max = 0;

		for (int i = 1; i <= m; i++) {
			max += canEat[i];
		}

		System.out.println(Math.min(k, max));
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
