/**
 * 
 */
package p266;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P266A_StonesOnTheTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			reader.readLine();
			String stoneString = reader.readLine();

			reader.close();
			isr.close();

			int index = 0, count = 0;

			while (index < stoneString.length()) {
				int i = index + 1;

				while (i < stoneString.length()
						&& stoneString.charAt(i) == stoneString.charAt(i - 1)) {
					i++;
				}

				count++;
				index = i;
			}

			int result = stoneString.length() - count;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
