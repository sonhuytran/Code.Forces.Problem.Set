/**
 * 
 */
package p298;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P298A_SnowFootprints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String footprints = scanner.nextLine();
		scanner.close();

		int left = 0;

		while (footprints.charAt(left) == '.') {
			left++;
		}

		int right = left;

		while (footprints.charAt(right) == footprints.charAt(left)) {
			right++;
		}

		if (footprints.charAt(right) != '.') {
			right--;
		}

		if (footprints.charAt(left) == 'L') {
			int temp = left;
			left = right;
			right = temp;
			left--;
			right--;
		}

		System.out.println((left + 1) + " " + (right + 1));
	}
}
