/**
 * 
 */
package p148;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P148A_InsomniaCure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// read inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			int[] harmeds = new int[4];

			for (int i = 0; i < harmeds.length; i++) {
				harmeds[i] = Integer.parseInt(reader.readLine());
			}

			int d = Integer.parseInt(reader.readLine());

			reader.close();
			isr.close();
			// end read inputs

			boolean[] dragons = new boolean[d + 1];

			for (int i = 0; i < harmeds.length; i++) {
				for (int j = harmeds[i]; j <= d; j += harmeds[i]) {
					dragons[j] = true;
				}
			}

			int harmedCount = 0;

			for (int i = 1; i < dragons.length; i++) {
				if (dragons[i]) {
					harmedCount++;
				}
			}

			System.out.println(harmedCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
