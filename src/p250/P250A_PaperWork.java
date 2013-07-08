package p250;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P250A_PaperWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int[] performance = reader.nextIntArray(n);

		int index = 0, folderCount = 0, lostCount = 0, i = 0;
		StringBuilder result = new StringBuilder();

		do {
			lostCount = 0;
			i = index;

			while (lostCount < 3 && i < n) {
				if (performance[i] < 0) {
					lostCount++;
				}

				i++;
			}

			if (lostCount >= 3) {
				i--;
			}

			result.append((i - index) + " ");
			index = i;
			folderCount++;
		} while (index < n);

		result.insert(0, folderCount + "\n");
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
	}
}
