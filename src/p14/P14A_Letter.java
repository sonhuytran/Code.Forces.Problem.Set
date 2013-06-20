/**
 * 
 */
package p14;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P14A_Letter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		String[] sheet = new String[n];

		for (int i = 0; i < n; i++) {
			sheet[i] = scanner.nextLine();
		}

		scanner.close();

		int maxi = Integer.MIN_VALUE, maxj = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE, minj = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			String line = sheet[i];

			for (int j = 0; j < m; j++) {
				char ch = line.charAt(j);

				if (ch == '*') {
					if (i > maxi) {
						maxi = i;
					}

					if (i < mini) {
						mini = i;
					}

					if (j > maxj) {
						maxj = j;
					}

					if (j < minj) {
						minj = j;
					}
				}
			}
		}
		
		maxj++;
		
		for (int i = mini; i <= maxi; i++) {
			String line = sheet[i].substring(minj, maxj);
			System.out.println(line);
		}
	}
}
