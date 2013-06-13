/**
 * 
 */
package p50;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P50A_DominoPiling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String inputString = reader.readLine();
			String[] inputStrings = inputString.split(" ");

			int m = Integer.valueOf(inputStrings[0]);
			int n = Integer.valueOf(inputStrings[1]);

			reader.close();
			isr.close();

			int nDomino = m * n / 2;
			System.out.println(nDomino);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
