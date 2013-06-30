/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
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

	public int[][] next2DIntArray(int n, int m) {
		int[][] result = new int[n][];
		for (int i = 0; i < n; i++) {
			result[i] = nextIntArray(m);
		}
		return result;
	}

}

public class CodeForcesUtils {
	class OutputWriter {
		private PrintWriter writer;

		public OutputWriter(OutputStream stream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					stream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void println(int x) {
			writer.println(x);
		}

		public void close() {
			writer.close();
		}
	}

	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static void readStandardInput2() {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}

	public static void readStandardInput() {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs

			reader.close();
			isr.close();
			// end reading inputs
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}