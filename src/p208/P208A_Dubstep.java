/**
 * 
 */
package p208;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P208A_Dubstep {

	private static String getOriginalSong(String wubSong) {
		String original = wubSong.replaceAll("(WUB)+", " ");
		return original.trim();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String result = getOriginalSong(input);
		System.out.println(result);
	}
}
