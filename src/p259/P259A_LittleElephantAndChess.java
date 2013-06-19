/**
 * 
 */
package p259;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P259A_LittleElephantAndChess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] lines = new String[8];

		for (int i = 0; i < 8; i++) {
			lines[i] = scanner.nextLine();
		}

		scanner.close();

		String line1 = "WBWBWBWB";
		String line2 = "BWBWBWBW";

		for (int i = 0; i < 8; i++) {
			String line = lines[i];

			if (!line.equals(line1) && !line.equals(line2)) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
