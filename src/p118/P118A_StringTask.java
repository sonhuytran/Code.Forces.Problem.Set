/**
 * 
 */
package p118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P118A_StringTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String vowelString = "aoyeui";

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String input = reader.readLine();
			input = input.toLowerCase();

			StringBuilder stringBuilder = new StringBuilder(input);

			for (int i = 0; i < stringBuilder.length(); i++) {
				String c = String.valueOf(stringBuilder.charAt(i));

				if (vowelString.contains(c)) {
					stringBuilder.deleteCharAt(i);
					i--;
				} else {
					stringBuilder.insert(i, ".");
					i++;
				}
			}

			System.out.println(stringBuilder.toString());

			reader.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
