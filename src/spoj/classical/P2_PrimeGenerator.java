/**
 * 
 */
package spoj.classical;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * @author Huy
 * 
 */
class P2_PrimeGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int n = reader.nextInt();
		int[][] inputs = reader.next2DIntArray(n, 2);

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (inputs[i][1] > max) {
				max = inputs[i][1];
			}
		}

		int[] primes = new Primes(max).getPrimes();

		for (int i = 0; i < n; i++) {
			int index = 0;

			while (index < primes.length
					&& primes[index] < inputs[i][0]) {
				index++;
			}

			if (index < primes.length) {
				do {
					System.out.println(primes[index++]);
				} while (index < primes.length
						&& primes[index] <= inputs[i][1]);
			}

			System.out.println();
		}
	}

	private static class Primes {

		int[] primeNumbers;
		int nPrimes;

		public Primes(int max) {
			if (max < 2) {
				primeNumbers = new int[] { 0 };
				return;
			} else if (max == 2) {
				primeNumbers = new int[] { 0, 2 };
				return;
			} else if (max == 3) {
				primeNumbers = new int[] { 0, 2, 3 };
				return;
			} else {
				ArrayList<Integer> primeList = new ArrayList<Integer>();
				primeList.add(2);
				primeList.add(3);
				nPrimes = 2;
				int p = 3;

				while (p < max) {
					p = nextPrime(p, primeList);
					primeList.add(p);
				}

				nPrimes = primeList.size();
				primeNumbers = new int[nPrimes + 1];

				for (int i = 1; i <= nPrimes; i++) {
					primeNumbers[i] = primeList.get(i - 1);
				}
			}
		}

		private int nextPrime(int p) {
			do {
				p += 2;
			} while (!isPrime(p));

			return p;
		}

		private int nextPrime(int p, ArrayList<Integer> primes) {
			do {
				p += 2;
			} while (!isPrime(p, primes));

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

		private boolean isPrime(int n, ArrayList<Integer> primes) {
			int root = (int) Math.sqrt(n + 1);

			for (int i = 1; i < primes.size() && primes.get(i) <= root; i++) {
				if (n % primes.get(i) == 0) {
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