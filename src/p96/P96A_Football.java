/**
 * 
 */
package p96;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P96A_Football {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String playersString = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs
			String zeroDangerous = "0000000";
			String oneDangerous = "1111111";

			boolean result = playersString.contains(zeroDangerous)
					|| playersString.contains(oneDangerous);

			System.out.println(result ? "YES" : "NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
