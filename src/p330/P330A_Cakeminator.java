/**
 * 
 */
package p330;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

/**
 * @author Huy
 * 
 */
public class P330A_Cakeminator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int r = reader.nextInt(), c = reader.nextInt();
		boolean[] evilR = new boolean[r];
		boolean[] evilC = new boolean[c];
		char input;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				input = reader.nextChar();
				
				if (input == 'S') {
					evilR[i] = true;
					evilC[j] = true;
				}
			}
		}

		int result = r * c;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (evilR[i] && evilC[j]) {
					result--;
				}
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
}