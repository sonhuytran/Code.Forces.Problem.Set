package p325;

import java.util.Scanner;
import java.util.TreeSet;

public class P325B_StadiumAndGames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read the inputs
		long n = scanner.nextLong();
		find(n);

		scanner.close();
	}

	private static void find(long n) {
		TreeSet<Long> solutions = new TreeSet<>();

		long max = (long) Math.sqrt(n * 2) + 1;
		long temp;

		for (long i = 1; i <= max; i += 2) {
			temp = n - i * (i - 1) / 2;

			if (temp == 0) {
				solutions.add(i);
			} else if (temp % i == 0) {
				temp = temp / i + 1;
				long temp2 = (long) (Math.log(temp) / Math.log(2));

				if (Math.pow(2, temp2) == temp) {
					solutions.add(i * temp);
				}
			}
		}

		if (solutions.isEmpty()) {
			System.out.println(-1);
		}

		StringBuilder result = new StringBuilder();

		for (Long number : solutions) {
			result.append(number);
			result.append('\n');
		}

		System.out.println(result.toString().trim());
	}
}
