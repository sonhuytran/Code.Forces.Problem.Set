/**
 * 
 */
package p112;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P112A_PetyaAndStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String string1 = reader.readLine();
			String string2 = reader.readLine();

			reader.close();
			isr.close();
			
			int result = string1.compareToIgnoreCase(string2);

			if (result <= -1) {
				result = -1;
			} else if (result >= 1) {
				result = 1;
			}
			
			System.out.println(result);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
