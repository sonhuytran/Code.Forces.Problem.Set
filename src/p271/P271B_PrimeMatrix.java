package p271;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class P271B_PrimeMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxPrime = 9593;
		Primes primes = new Primes(maxPrime);
		int[] primeNumbers = primes.getPrimes();

		InputReader inputReader = new InputReader(System.in);
		int n = inputReader.nextInt();
		int m = inputReader.nextInt();
		int[][] numbers = inputReader.next2DIntArray(n, m);

		int min = Integer.MAX_VALUE, distance = -1;
		int[] sumRow = new int[n];
		int[] sumColumn = new int[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				distance = nearestPrimeDistance(primeNumbers, numbers[i][j]);
				sumRow[i] += distance;
				sumColumn[j] += distance;
			}

			if (sumRow[i] <= 0) {
				System.out.println(0);
				return;
			}

			if (sumRow[i] < min) {
				min = sumRow[i];
			}
		}

		for (int j = 0; j < m; j++) {
			if (sumColumn[j] < min) {
				min = sumColumn[j];
			}
		}

		System.out.println(min);
	}

	private static int nearestPrimeDistance(int[] primeNumbers, int number) {
		int left = 1, right = primeNumbers.length - 1, mid = (left + right) / 2;

		do {
			if (primeNumbers[mid] == number) {
				return 0;
			} else if (primeNumbers[mid] > number) {
				right = mid - 1;
			} else if (primeNumbers[mid] < number) {
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
		} while (left <= right);

		return primeNumbers[left] - number;
	}
}

class Primes {

	int[] primeNumbers;
	int nPrimes;

	public Primes(int n) {
		primeNumbers = new int[n + 1];
		primeNumbers[1] = 2;
		primeNumbers[2] = 3;
		nPrimes = 2;
		int p = 3;

		while (nPrimes < n) {
			p = primeNumbers[++nPrimes] = nextPrime(p);
		}
	}

	private int nextPrime(int p) {
		do {
			p += 2;
		} while (!isPrime(p));

		return p;
	}

	private boolean isPrime(int n) {
		int root = (int) Math.sqrt(n + 1);

		for (int i = 1; i < primeNumbers.length && primeNumbers[i] <= root; i++) {
			if (n % primeNumbers[i] == 0) {
				return false;
			}
		}

		return true;
	}

	public boolean isPrimeNumber(int number) {
		if (number > primeNumbers[nPrimes]) {
			return isPrime(number);
		}

		// binary search
		int low = 0, high = nPrimes;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (primeNumbers[mid] == number) {
				return true;
			} else if (primeNumbers[mid] > number) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return false;
	}

	public int[] getPrimes() {
		return primeNumbers;
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
		if (numChars == -1) {
			throw new InputMismatchException();
		}

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

		while (isSpaceChar(c)) {
			c = read();
		}

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

		while (isSpaceChar(c)) {
			c = read();
		}

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