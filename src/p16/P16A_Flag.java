/**
 * 
 */
package p16;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P16A_Flag {

	private static boolean isStandard(int n, int m, String[] lines) {
		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			char firstChar = line.charAt(0);

			if (i > 0 && firstChar == lines[i - 1].charAt(0)) {
				return false;
			}

			for (int j = 1; j < line.length(); j++) {
				if (line.charAt(j) != firstChar) {
					return false;
				}
			}
		}
		
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		String[] lines = new String[n];

		for (int i = 0; i < n; i++) {
			lines[i] = scanner.nextLine();
		}

		scanner.close();

		boolean result = isStandard(n, m, lines);
		System.out.println(result ? "YES" : "NO");
	}
}
