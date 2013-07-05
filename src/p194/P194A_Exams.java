package p194;

import java.util.Scanner;

public class P194A_Exams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt();
		scanner.close();
		int count = 0, temp = 0;

		while (n > 0) {
			if (k % n == 0) {
				temp = k / n;

				if (temp == 2) {
					count += n;
				}

				break;
			} else {
				temp = k / n;

				if (temp == 2) {
					count++;
				}

				k -= temp;
				n--;
			}
		}
		
		System.out.println(count);
	}
}
