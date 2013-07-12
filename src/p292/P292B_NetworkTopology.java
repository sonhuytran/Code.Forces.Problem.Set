package p292;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P292B_NetworkTopology {

	private static final String TOPOLOGY_UNKNOWN = "unknown topology";
	private static final String TOPOLOGY_BUS = "bus topology";
	private static final String TOPOLOGY_RING = "ring topology";
	private static final String TOPOLOGY_STAR = "star topology";

	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt(), m = reader.nextInt();
		int[][] vertices = reader.next2DIntArray(m, 2);
		int[] count = new int[n + 1];

		if (m != n && m != n - 1) {
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			count[vertices[i][0]]++;
			count[vertices[i][1]]++;
		}

		if (m == n) {
			for (int i = 1; i <= n; i++) {
				if (count[i] != 2) {
					System.out.println(TOPOLOGY_UNKNOWN);
					return;
				}
			}

			System.out.println(TOPOLOGY_RING);
			return;
		}

		int count1 = 0, count2 = 0, countn = 0;

		for (int i = 1; i <= n; i++) {
			if (count[i] == 1) {
				count1++;
			} else if (count[i] == 2) {
				count2++;
			} else if (count[i] == n - 1) {
				countn++;
			} else {
				System.out.println(TOPOLOGY_UNKNOWN);
				return;
			}
		}

		if (count1 == 2 && count2 == n - 2) {
			System.out.println(TOPOLOGY_BUS);
		} else if (count1 == n - 1 && countn == 1) {
			System.out.println(TOPOLOGY_STAR);
		} else {
			System.out.println(TOPOLOGY_UNKNOWN);
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
