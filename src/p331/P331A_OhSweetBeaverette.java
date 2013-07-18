/**
 * 
 */
package p331;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P331A_OhSweetBeaverette {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		Integer[] appeals = reader.nextIntArray(n);
		List<Integer> appealList = Arrays.asList(appeals);
		int index = -1, firstIndex = -1, negativeCount = 0, negativeTemp = 0, value = 0;
		int maxStart = -1, maxEnd = -1;
		long max = Long.MIN_VALUE;
		long sum = 0;

		for (int i = 0; i < appealList.size() - 1; i++) {
			value = appealList.get(i);
			firstIndex = appealList.indexOf(value);

			if (firstIndex != i) {
				continue;
			}

			index = appealList.lastIndexOf(value);

			if (index != i) {
				sum = 2 * value;
				negativeTemp = 0;

				for (int j = i + 1; j < index; j++) {
					value = appealList.get(j);

					if (value >= 0) {
						sum += value;
					} else {
						negativeTemp++;
					}
				}

				if (sum > max) {
					max = sum;
					negativeCount = negativeTemp;
					maxStart = i;
					maxEnd = index;
				}
			}
		}

		int destroyed = maxStart + negativeCount + (n - maxEnd - 1);

		StringBuilder result = new StringBuilder();
		result.append(String.format("%d %d\n", max, destroyed));

		for (int i = 0; i < maxStart; i++) {
			result.append(i + 1);
			result.append(' ');
		}

		if (negativeCount > 0) {
			for (int i = maxStart + 1; i < maxEnd; i++) {
				if (appealList.get(i) < 0) {
					result.append(i + 1);
					result.append(' ');
				}
			}
		}

		for (int i = maxEnd + 1; i < n; i++) {
			result.append(i + 1);
			result.append(' ');
		}

		System.out.println(result.toString().trim());
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

		public Integer[] nextIntArray(int count) {
			Integer[] result = new Integer[count];

			for (int i = 0; i < count; i++) {
				result[i] = nextInt();
			}

			return result;
		}
	}

}
