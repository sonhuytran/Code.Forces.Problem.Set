/**
 * 
 */
package p131;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P131A_cAPSlOCK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String input = reader.readLine();

			reader.close();
			isr.close();

			String output = null;

			boolean needChange = true;

			for (int i = 1; i < input.length(); i++) {
				if (Character.isLowerCase(input.charAt(i))) {
					needChange = false;
					break;
				}
			}

			if (needChange) {
				StringBuilder stringBuilder = new StringBuilder();
				char ch = input.charAt(0);

				if (Character.isLowerCase(ch)) {
					stringBuilder.append(Character.toUpperCase(ch));
				} else {
					stringBuilder.append(Character.toLowerCase(ch));
				}

				stringBuilder.append(input.substring(1).toLowerCase());

				output = stringBuilder.toString();
			} else {
				output = input;
			}

			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
