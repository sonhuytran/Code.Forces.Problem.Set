/**
 * 
 */
package p281;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P281A_WordCapitalization {

	private static String capitalize(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		stringBuilder.setCharAt(0,
				Character.toUpperCase(stringBuilder.charAt(0)));
		return stringBuilder.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String word = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs

			String result = capitalize(word);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
