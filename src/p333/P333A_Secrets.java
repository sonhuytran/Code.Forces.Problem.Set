package p333;

import java.util.Scanner;

public class P333A_Secrets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();

		long i = 3;

		while (n % i == 0) {
			i *= 3;
		}
		
		System.out.println(n / i + 1);
	}

}
