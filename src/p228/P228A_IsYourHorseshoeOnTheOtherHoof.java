/**
 * 
 */
package p228;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P228A_IsYourHorseshoeOnTheOtherHoof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String colorString = reader.readLine();
			String[] colorStrings = colorString.split(" ");
			long[] colors = new long[4];

			for (int i = 0; i < 4; i++) {
				colors[i] = Long.parseLong(colorStrings[i]);
			}

			reader.close();
			isr.close();
			// end reading inputs

			// count different color
			TreeSet<Long> differents = new TreeSet<>();

			for (int i = 0; i < 4; i++) {
				differents.add(colors[i]);
			}

			int result = 4 - differents.size();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
