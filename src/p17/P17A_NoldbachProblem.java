package p17;

import java.util.Scanner;

public class P17A_NoldbachProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxPrime = 101;
		Primes p = new Primes(maxPrime);
		int[] primeNumbers = p.getPrimes();

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();

		if (k <= 0) {
			System.out.println("YES");
			return;
		}

		int count = 0;

		for (int i = 2; i <= maxPrime; i++) {
			if (primeNumbers[i] + primeNumbers[i - 1] + 1 > n) {
				break;
			}

			if (p.isPrime(primeNumbers[i] + primeNumbers[i - 1] + 1)) {
				count++;

				if (count >= k) {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("NO");
	}

	private static class Primes {

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

}
