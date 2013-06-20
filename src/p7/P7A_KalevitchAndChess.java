/**
 * 
 */
package p7;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P7A_KalevitchAndChess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean columnCount = false;
		int countBlackLine = 0;

		for (int i = 0; i < 8; i++) {
			String line = scanner.nextLine();

			if (line.equals("BBBBBBBB")) {
				countBlackLine++;
			} else if (!columnCount) {
				int column = 0;

				for (int j = 0; j < line.length(); j++) {
					if (line.charAt(j) == 'B') {
						column++;
					}
				}

				columnCount = true;
				countBlackLine += column;
			}
		}

		scanner.close();
		System.out.println(countBlackLine);
	}

}
