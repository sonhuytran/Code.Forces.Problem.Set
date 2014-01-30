package p337;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class P337A_Puzzles {

	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] puzzles = reader.nextIntArray(m);

		Arrays.sort(puzzles);

		int result = Integer.MAX_VALUE, temp = 0;

		for (int i = 0, j = n - 1; j < m; i++, j++) {
			temp = puzzles[j] - puzzles[i];
			
			if (temp < result) {
				result = temp;
			}
		}
		
		System.out.println(result);
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
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = nextInt();
		}
		return result;
	}
}