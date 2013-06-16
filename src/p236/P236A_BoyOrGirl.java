/**
 * 
 */
package p236;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P236A_BoyOrGirl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String nickname = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs

			Set<Character> distinctChars = new HashSet<>();

			for (int i = 0; i < nickname.length(); i++) {
				distinctChars.add(nickname.charAt(i));
			}

			boolean isAGirl = (distinctChars.size() % 2 == 0);

			System.out.println(isAGirl ? "CHAT WITH HER!" : "IGNORE HIM!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
