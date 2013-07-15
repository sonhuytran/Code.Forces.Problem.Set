package p300;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P300B_Coach {

	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] likes = reader.next2DIntArray(m, 2);
		int[] labels = new int[n + 1];
		boolean[] liked = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			labels[i] = i;
		}

		for (int i = 0; i < m; i++) {
			labels[likes[i][1]] = labels[likes[i][0]];
			liked[likes[i][0]] = liked[likes[i][1]] = true;
		}

		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean[n + 1];
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (visited[i]) {
				continue;
			}

			visited[i] = true;
			count = 1;
			result.append(i);
			result.append(' ');

			for (int j = i + 1; j <= n; j++) {
				if (labels[j] == labels[i]) {
					count++;

					if (count > 3) {
						System.out.println(-1);
						return;
					}

					visited[j] = true;
					result.append(j);
					result.append(' ');
				}
			}

			if (count < 3) {
				int j = i + 1;

				while (count < 3) {
					if (!liked[j] && !visited[j]) {
						result.append(j);
						result.append(' ');
						visited[j] = true;
						count++;
					}

					j++;
				}
			}

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
