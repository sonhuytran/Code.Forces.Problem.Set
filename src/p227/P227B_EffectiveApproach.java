package p227;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P227B_EffectiveApproach {

	private static int[] left = null;
	private static int[] right = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();

		left = new int[n + 1];
		right = new int[n + 1];
		int input = 0;

		for (int i = 1; i <= n; i++) {
			input = inputReader.nextInt();
			left[input] = i;
			right[input] = n - i + 1;
		}

		int m = inputReader.nextInt();
		long countLeft = 0, countRight = 0;
		int query = 0;

		for (int i = 0; i < m; i++) {
			query = inputReader.nextInt();
			countLeft += left[query];
			countRight += right[query];
		}

		System.out.println(countLeft + " " + countRight);
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
	}
}
