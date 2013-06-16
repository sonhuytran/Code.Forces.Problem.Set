/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class CodeForcesUtils {
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static void readStandardInput() {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs

			reader.close();
			isr.close();
			// end reading inputs
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}