/**
 * 
 */
package p349;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

/**
 * @author Huy
 * 
 */
public class P349A_CinemaLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();
		int budget = 0, next = 0, change = 0;

		for (int i = 0; i < n; i++) {
			next = inputReader.nextInt();
			change = next - 25;
			
			if (change > 0) {
				budget -= change;

				if (budget < 0) {
					System.out.println("NO");
					return;
				}
			}

			budget += 25;
		}
		
		System.out.println("YES");
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