/**
 * 
 */
package p263;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P263A_BeautifulMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			int size = 5;
			int[][] input = new int[size][size];

			for (int i = 0; i < size; i++) {
				String[] line = reader.readLine().split(" ");

				for (int j = 0; j < size; j++) {
					input[i][j] = Integer.parseInt(line[j]);
				}
			}

			reader.close();
			isr.close();
			// end reading inputs

			// locate the number 1
			int i = 0, j = 0;
			boolean found = false;

			for (i = 0; i < size; i++) {
				for (j = 0; j < size; j++) {
					if (input[i][j] == 1) {
						found = true;
						break;
					}
				}
				
				if (found) {
					break;
				}
			}

			int middle = size / 2;
			int result = Math.abs(middle - i) + Math.abs(middle - j);

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
