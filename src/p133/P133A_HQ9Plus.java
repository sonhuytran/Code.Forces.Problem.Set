/**
 * 
 */
package p133;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P133A_HQ9Plus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String hq9plus = reader.readLine();

			reader.close();
			isr.close();

			String result = "NO";

			if (hq9plus.contains("H") || hq9plus.contains("Q")
					|| hq9plus.contains("9")) {
				result = "YES";
			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
