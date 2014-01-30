package p379;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P379A_NewYearCandles {

	public static void main(String[] args) {
		try {
			InputReader reader = new InputReader(System.in);
			int a = reader.nextInt();
			int b = reader.nextInt();
			int result = a;
			int wentOuts = a;
			int next = 0;

			while (wentOuts >= b) {
				next = wentOuts / b;
				result += next;
				wentOuts = next + wentOuts % b;
			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
}
