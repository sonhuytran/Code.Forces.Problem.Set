package p262;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P262B_RomaAndChangingSigns {

	private static int sum = 0;

	static class InputReader {

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

		public char nextChar() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			return (char) c;
		}

		public int[] nextIntArray(int count) {
			int[] result = new int[count];

			for (int i = 0; i < count; i++) {
				result[i] = nextInt();
				sum += result[i];
			}

			return result;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();
		int k = inputReader.nextInt();
		int[] numbers = inputReader.nextIntArray(n);
		// Arrays.sort(numbers);

		int index = 0;

		while (k > 0 && index < n && numbers[index] < 0) {
			numbers[index] = -numbers[index];
			sum += (numbers[index] * 2);
			k--;
			index++;
		}

		while (k >= 2) {
			k -= 2;
		}

		if (k > 0) {
			if (index >= n) {
				index--;
			} else if (0 < index && index < n
					&& numbers[index] > numbers[index - 1]) {
				index--;
			}

				numbers[index] = -numbers[index];
			sum += (numbers[index] * 2);
		}

		System.out.println(sum);
	}
}