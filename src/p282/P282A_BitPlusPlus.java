/**
 * 
 */
package p282;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P282A_BitPlusPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// read inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			int nOperations = Integer.parseInt(reader.readLine());
			String[] operations = new String[nOperations];

			for (int i = 0; i < nOperations; i++) {
				operations[i] = reader.readLine();
			}

			reader.close();
			isr.close();
			// end reading inputs

			String[] plusOperations = { "X++", "++X" };
			String[] minusOperations = { "X--", "--X" };

			int x = 0;

			for (int i = 0; i < nOperations; i++) {
				String currentOperation = operations[i];

				if (currentOperation.equals(plusOperations[0])
						|| currentOperation.equals(plusOperations[1])) {
					x++;
				} else if (currentOperation.equals(minusOperations[0])
						|| currentOperation.equals(minusOperations[1])) {
					x--;
				}
			}

			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
