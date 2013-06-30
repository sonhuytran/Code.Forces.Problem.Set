package p222;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P222B_CosmicTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();
		int m = inputReader.nextInt();
		int k = inputReader.nextInt();

		int[][] numbers = inputReader.next2DIntArray(n, m);
		int[] rows = new int[n + 1];
		int[] columns = new int[m + 1];

		for (int i = 1; i <= n; i++) {
			rows[i] = i;
		}

		for (int i = 1; i <= m; i++) {
			columns[i] = i;
		}

		StringBuilder stringBuilder = new StringBuilder();
		int x = 0, y = 0, temp = 0;

		for (int i = 0; i < k; i++) {
			char command = inputReader.nextChar();
			x = inputReader.nextInt();
			y = inputReader.nextInt();

			if (command == 'c') {
				temp = columns[x];
				columns[x] = columns[y];
				columns[y] = temp;
			} else if (command == 'r') {
				temp = rows[x];
				rows[x] = rows[y];
				rows[y] = temp;
			} else if (command == 'g') {
				stringBuilder.append(numbers[rows[x]][columns[y]]);
				stringBuilder.append('\n');
			}
		}

		System.out.println(stringBuilder.toString().trim());
	}
}

class InputReader {

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
		int[] result = new int[count + 1];

		for (int i = 1; i <= count; i++) {
			result[i] = nextInt();
		}

		return result;
	}

	public int[][] next2DIntArray(int n, int m) {
		int[][] result = new int[n + 1][];

		for (int i = 1; i <= n; i++) {
			result[i] = nextIntArray(m);
		}

		return result;
	}

}