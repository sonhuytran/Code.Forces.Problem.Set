package p31;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class P31A_WormsEvolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int[] lengths = reader.nextIntArray(n);
		int[] indexes = new int[n];

		for (int i = 0; i < n; i++) {
			indexes[i] = i + 1;
		}

		int maxi = n - 1, maxj = n, k = -1;

		for (int i = 0; i < maxi; i++) {
			for (int j = i + 1; j < maxj; j++) {
				if (lengths[i] > lengths[j]) {
					k = lengths[i];
					lengths[i] = lengths[j];
					lengths[j] = k;

					k = indexes[i];
					indexes[i] = indexes[j];
					indexes[j] = k;
				}
			}
		}

		maxi = n - 2;
		maxj = n - 1;
		k = -1;

		for (int i = 0; i < maxi; i++) {
			for (int j = i + 1; j < maxj; j++) {
				k = Arrays.binarySearch(lengths, lengths[i] + lengths[j]);

				if (k >= 0) {
					System.out.println(indexes[k] + " " + indexes[i] + " "
							+ indexes[j]);
					return;
				}
			}
		}

		System.out.println(-1);
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
