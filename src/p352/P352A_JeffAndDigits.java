/**
 * 
 */
package p352;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

/**
 * @author Huy
 * 
 */
public class P352A_JeffAndDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int k = 0;

		for (int i = 0; i < n; i++) {
			if (reader.nextInt() == 5) {
				k++;
			}
		}

		int n5 = k / 9;
		int n0 = n - k;

		StringBuilder result = new StringBuilder();
		
		if (n0 <= 0) {
			System.out.println(-1);
			return;
		}

		if (n5 <= 0) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < n5; i++) {
			result.append("555555555");
		}

		for (int i = 0; i < n0; i++) {
			result.append('0');
		}

		System.out.println(result.toString());
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

}