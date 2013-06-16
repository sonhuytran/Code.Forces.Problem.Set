/**
 * 
 */
package p61;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P61A_UltraFastMathematician {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String number1 = reader.readLine();
			String number2 = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < number1.length(); i++) {
				int bit1 = Integer.parseInt(number1.substring(i, i + 1));
				int bit2 = Integer.parseInt(number2.substring(i, i + 1));

				stringBuilder.append(bit1 ^ bit2);
			}
			
			String result = stringBuilder.toString();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
