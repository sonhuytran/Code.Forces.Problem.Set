/**
 * 
 */
package p108;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P108A_PalindromicTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		scanner.close();

		int[] palindromeHour = { 0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 15, 20,
				21, 22, 23 };
		int[] palindromeMin = { 0, 10, 20, 30, 40, 50, 01, 11, 21, 31, 41, 51,
				2, 12, 22, 32 };

		int index = 0;

		while (palindromeHour[index] < hour) {
			index++;
		}

		if (palindromeHour[index] == hour && palindromeMin[index] <= min) {
			index++;
		}

		if (index >= palindromeHour.length) {
			index = 0;
		}

		System.out.println(String.format("%02d:%02d", palindromeHour[index],
				palindromeMin[index]));
	}
}
