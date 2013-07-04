package c327;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class C327B_HungrySequence {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		(new Primes(n)).getPrimes();
	}
}

class Primes {

	int[] primeNumbers;
	int nPrimes;

	public Primes(int n) throws IOException {
		if (n <= 0) {
			return;
		}

		if (n == 1) {
			primeNumbers = new int[] { 2 };
			System.out.println(2);
			return;
		}

		if (n == 2) {
			primeNumbers = new int[] { 2, 3 };
			System.out.println("2 3");
			return;
		}

		primeNumbers = new int[n + 1];
		primeNumbers[1] = 2;
		primeNumbers[2] = 3;
		nPrimes = 2;
		int p = 3;

		// StringBuilder stringBuilder = new StringBuilder(n * 6);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				System.out));
		writer.write("2 3 ");

		while (nPrimes < n) {
			p = primeNumbers[++nPrimes] = nextPrime(p);
			// System.out.print(p + " ");
			writer.write(p + " ");

			// stringBuilder.append(p);
			// stringBuilder.append(' ');
		}

		writer.flush();
		// System.out.println(stringBuilder.toString().trim());
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
