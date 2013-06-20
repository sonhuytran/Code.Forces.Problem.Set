/**
 * 
 */
package p137;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P137A_PostcardsAndPhotos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String objects = scanner.nextLine();
		scanner.close();

		int index = 0;
		int countTimes = 0;

		while (index < objects.length()) {
			int countObjects = 1;
			int i = index + 1;

			while (countObjects < 5 && i < objects.length()
					&& objects.charAt(i) == objects.charAt(index)) {
				i++;
				countObjects++;
			}

			countTimes++;
			index = i;
		}

		System.out.println(countTimes);
	}
}
